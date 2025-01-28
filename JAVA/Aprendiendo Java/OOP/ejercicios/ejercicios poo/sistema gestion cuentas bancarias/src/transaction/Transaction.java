package transaction;

import account.Account;
import account.CurrencyOptions;

import java.time.LocalDateTime;

public class Transaction {

    private final TransactionType type;
    private CurrencyOptions currency;
    private final String id;
    private double amount;
    private Account sourceAccount;
    private Account destinationAccount;
    private LocalDateTime timestamp;


    // constructor for normal transaction
    public Transaction(String id, double amount, Account sourceAccount, Account destinationAccount, String sourceAccountId, String destinationAccountId, LocalDateTime timestamp, TransactionType type) {
        if (amount <=0) throw new IllegalArgumentException("Invalid Amount");
        if (currency == null) throw new IllegalArgumentException("Currency cannot be null.");
        this.id = id;
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.timestamp = (timestamp != null) ? timestamp : LocalDateTime.now();
        this.type = type;
        this.currency = currency;
    }

    //overload to transactions without destination like deposit/withrawal
    public Transaction(String id, TransactionType type, double amount, Account sourceAccount, CurrencyOptions currency) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid Amount");
        if (type == TransactionType.TRANSFER) {
            throw new IllegalArgumentException("Transfer transactions require a destination account.");
        }
        if (currency == null) throw new IllegalArgumentException("Currency cannot be null.");
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.timestamp = (timestamp != null) ? timestamp : LocalDateTime.now();
        this.sourceAccount = sourceAccount;
        this.destinationAccount = null;
        this.currency = currency;

    }

    //getters and setters
    public LocalDateTime getTimestamp() {
        return timestamp;
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

    public String getId() {
        return id;
    }


    public void displayTransactionDetails(){
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Date : " + timestamp);

        switch (type) {
            case DEPOSIT:
                System.out.println("Deposit to account: " + );
                break;

            case WITHDRAWAL:
                System.out.println("Withdrawal from account: " + );
                break;

            case TRANSFER:
                System.out.println("Transfer from " +  + " to " + );
                break;

            default:
                System.out.println("Unknown transaction type");
        }

    }

}
