package transaction;
import java.time.format.DateTimeFormatter; // Asegúrate de importar esto

import account.Account;
import account.CheckingAccount;
import account.CurrencyOptions;
import account.SavingsAccount;

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


    public Transaction(TransactionType type, double amount, Account sourceAccount) {
        if (amount <=0) throw new IllegalArgumentException("Invalid Amount");
        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.sourceAccount = sourceAccount;
    }

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

//    public void setDestinationAccount(Account destinationAccount) {
//        this.destinationAccount = destinationAccount;
//    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

//    public void setSourceAccount(Account sourceAccount) {
//        this.sourceAccount = sourceAccount;
//    }

    public double getAmount() {
        return amount;
    }

//    public void setAmount(double amount) {
//        if (amount <= 0) {
//            throw new IllegalArgumentException("Amount should be positive.");
//        }
//        this.amount = amount;
//    }


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

        if ((balance - amount) < -overdraftLimit) {
            throw new IllegalArgumentException("Error. Insufficient funds. Overdraft limit exceeded.");
        }
        checkingAccount.withdraw(amount);
    }


    public void deposit(Account destinationAccount) {
        double amount = this.amount;
        if (this.type != TransactionType.DEPOSIT) {
            throw new IllegalStateException("No se puede realizar un depósito en una transacción que no es de tipo DEPOSIT");
        }

        if (!(destinationAccount instanceof SavingsAccount)) {
            throw new IllegalArgumentException("Error. Solo se pueden hacer depósitos en cuentas de ahorro (SavingsAccount).");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Error. The deposit amount must be positive.");
        }

        destinationAccount.deposit(amount);
    }



    public void transfer(Account sourceAccount, Account destinationAccount){
        double amount = this.amount;
        if (type != TransactionType.TRANSFER){
            throw new IllegalStateException("Invalid transaction type. This method is only for transfers.");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }

        if (sourceAccount == null || destinationAccount == null){
            throw new IllegalArgumentException("Both source and destination accounts must be provided.");
        }

        if (sourceAccount == destinationAccount) {
            throw new IllegalArgumentException("Cannot transfer to the same account.");
        }

        if (!sourceAccount.getCurrency().equals(destinationAccount.getCurrency())){
            throw new IllegalArgumentException("Transfers can only occur between accounts with the same currency.");
        }

        if (sourceAccount.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient funds for transfer.");
        }

        //realice transaction
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);

        System.out.println("Transfer successful: " + amount + " " + sourceAccount.getCurrency() +
                " from " + sourceAccount.getAccountHolder() + " to " + destinationAccount.getAccountHolder());

    }

    //Show transaction details
    public void displayTransactionDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Transaction Details:");
        System.out.println("ID: " + (uuid != null ? uuid : "N/A"));
        System.out.println("Type: " + (type != null ? type : "N/A"));
        System.out.println("Amount: " + amount + " " + (currency != null ? currency : "N/A"));
        System.out.println("Date: " + (timestamp != null ? timestamp.format(formatter) : "N/A"));

        switch (type) {
            case DEPOSIT:
                if (destinationAccount instanceof SavingsAccount) {
                    System.out.println("Deposited to Savings Account: " + destinationAccount);
                } else {
                    System.out.println("Error: Deposits can only be made to a Savings Account.");
                }
                break;

            case WITHDRAWAL:
                if (sourceAccount instanceof CheckingAccount) {
                    System.out.println("Withdrawal from Checking Account: " + sourceAccount);
                } else {
                    System.out.println("Error: Withdrawals can only be made from a Checking Account.");
                }
                break;

            case TRANSFER:
                if (sourceAccount == null || destinationAccount == null) {
                    System.out.println("Error: Both source and destination accounts must be provided.");
                    break;
                }
                if (sourceAccount == destinationAccount) {
                    System.out.println("Error: Cannot transfer to the same account.");
                    break;
                }
                if (!sourceAccount.getCurrency().equals(destinationAccount.getCurrency())) {
                    System.out.println("Error: Transfers can only occur between accounts with the same currency.");
                    break;
                }
                System.out.println("Transfer from " + sourceAccount.getAccountHolder() + " to " + destinationAccount.getAccountHolder());
                break;

            default:
                System.out.println("Unknown transaction type");
        }
    }


}
