package transaction;

import account.Account;
import account.CheckingAccount;
import account.CurrencyOptions;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final TransactionType type;
    private CurrencyOptions currency;
    private String uuid;
    private double amount;
    private Account sourceAccount;
    private Account destinationAccount;
    private LocalDateTime timestamp;


    // constructor for normal transaction
    public Transaction(double amount, Account sourceAccount, Account destinationAccount, TransactionType type, CurrencyOptions currency) {
        if (amount <=0) throw new IllegalArgumentException("Invalid Amount");
        if (currency == null) throw new IllegalArgumentException("Currency cannot be null.");
        this.uuid = UUID.randomUUID().toString();
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.timestamp = LocalDateTime.now();
        this.type = type;
        this.currency = currency;
    }


    //getters and setters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getUuid() {
        return uuid;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount should be positive.");
        }
        this.amount = amount;
    }


    public void withdraw(Account sourceAccount, double amount) {
        if (this.type != TransactionType.WITHDRAWAL){
            throw new IllegalStateException("No se puede realizar un retiro en una transacción que no es de tipo WITHDRAWAL");
        }

        if (!(sourceAccount instanceof CheckingAccount)){
            throw new IllegalArgumentException("Error. Solo se pueden hacer retiros desde una cuenta Checking.");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Error. The withdraw must be positive.");
        }
        CheckingAccount checkingAccount = (CheckingAccount) sourceAccount; // Downcast seguro
        double balance = checkingAccount.getBalance();
        double overdraftLimit = checkingAccount.getOverdraftLimit(); // Obtener el límite de sobregiro

        // Verificar que el retiro no exceda el límite de sobregiro
        if ((balance - amount) < -overdraftLimit) {
            throw new IllegalArgumentException("Error. Insufficient funds. Overdraft limit exceeded.");
        }
        checkingAccount.withdraw(amount);
    }


    public void deposit(Account sourceAccount, double amount) {
        if (amount > 0) {
          sourceAccount.getBalance()  += amount;
        } else {
            throw new IllegalArgumentException("Amount should be positive.");
        }
    }

    public void transfer(Account sourceAccount, Account destinationAccount, double amount, TransactionType type){
        if (amount < 0) throw new IllegalArgumentException("amount cannot be negative");
        if (sourceAccount.getCurrency() != destinationAccount.getCurrency()) throw new IllegalArgumentException("Transfers can only occur between accounts with the same currency.");
    }

    //Show transaction details
    public void displayTransactionDetails(){
        System.out.println("ID: " + uuid);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Date : " + timestamp);

        switch (type) {
            case DEPOSIT:
                System.out.println("Deposited to account: " + (destinationAccount != null ? destinationAccount : "N/A"));
                break;
            case WITHDRAWAL:
                System.out.println("Withdrawal from account: " + (sourceAccount != null ? sourceAccount : "N/A"));
                break;
            case TRANSFER:
                System.out.println("Transfer from " + (sourceAccount != null ? sourceAccount : "N/A") +
                        " to " + (destinationAccount != null ? destinationAccount : "N/A"));
                break;
            default:
                System.out.println("Unknown transaction type");
        }

    }

}
