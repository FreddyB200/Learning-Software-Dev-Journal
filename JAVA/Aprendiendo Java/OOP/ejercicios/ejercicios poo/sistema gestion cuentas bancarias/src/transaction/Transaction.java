package transaction;

import account.Account;
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

    //overload to transactions without destination like deposit/withrawal
    public Transaction(TransactionType type, double amount, Account sourceAccount, CurrencyOptions currency) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid Amount");
        if (type == TransactionType.TRANSFER) {
            throw new IllegalArgumentException("Transfer transactions require a destination account.");
        }
        if (currency == null) throw new IllegalArgumentException("Currency cannot be null.");
        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.sourceAccount = sourceAccount;
        this.destinationAccount = null;
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


    public void transfer

    //Show transaction details
    public void displayTransactionDetails(){
        System.out.println("ID: " + uuid);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Date : " + timestamp);

        switch (type) {
            case DEPOSIT:
                if (amount < 0) throw new IllegalArgumentException("amount cannot be negative");
                System.out.println("Deposited to account: " + (destinationAccount != null ? destinationAccount : "N/A"));
                break;
            case WITHDRAWAL:
                if (amount < 0) throw new IllegalArgumentException("amount cannot be negative");
                System.out.println("Withdrawal from account: " + (sourceAccount != null ? sourceAccount : "N/A"));
                break;
            case TRANSFER:
                if (amount < 0) throw new IllegalArgumentException("amount cannot be negative");
                //business rule3. "Transfers can only occur between accounts with the same currency."
                if (sourceAccount.getCurrency() != destinationAccount.getCurrency()) throw new IllegalArgumentException("Transfers can only occur between accounts with the same currency.");

                System.out.println("Transfer from " + (sourceAccount != null ? sourceAccount : "N/A") +
                        " to " + (destinationAccount != null ? destinationAccount : "N/A"));
                break;
            default:
                System.out.println("Unknown transaction type");
        }

    }

}
