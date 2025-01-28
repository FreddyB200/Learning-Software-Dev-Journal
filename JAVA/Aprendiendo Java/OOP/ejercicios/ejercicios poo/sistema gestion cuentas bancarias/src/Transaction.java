import account.Account;

import java.time.LocalDateTime;

public class Transaction {
    public enum TransactionType {
        DEPOSIT, WITHDRAWAL, TRANSFER
    }

    private final String id;
    private double amount;
    private Account sourceAccount;
    private Account destinationAccount;
    private String sourceAccountId;
    private String destinationAccountId;
    private LocalDateTime timestamp;
    private final TransactionType type;

    public Transaction(String id, double amount, Account sourceAccount, Account destinationAccount, String sourceAccountId, String destinationAccountId, LocalDateTime timestamp, TransactionType type) {
        if (amount <=0) throw new IllegalArgumentException("Invalid Amount");
        this.id = id;
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
        this.timestamp = timestamp;
        this.type = type;
    }

    //overload to transactions without destination like deposit
    public Transaction(String id, TransactionType type, double amount, String sourceAccountId) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = null; // 👈 Asignación manual
        this.timestamp = LocalDateTime.now(); // 👈 Código duplicado
    }

    //getters and setters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }


    public String getDestinationAccountId() {
        return destinationAccountId;
    }

    public void setDestinationAccountId(String destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public String getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
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

}
