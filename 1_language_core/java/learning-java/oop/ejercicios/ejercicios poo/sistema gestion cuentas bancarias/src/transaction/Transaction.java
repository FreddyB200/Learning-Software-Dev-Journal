package transaction;

import account.Account;
import account.CurrencyOptions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Transaction {
    private final String uuid;
    private final TransactionType type;
    private final double amount;
    private final Account sourceAccount;
    private final Account destinationAccount;
    private final LocalDateTime timestamp;
    private final CurrencyOptions currency;

    //DEPOSIT/WITHDRAWAL
    public Transaction(TransactionType type, double amount, Account account) {
        this(type, amount,
                type == TransactionType.WITHDRAWAL ? account : null,
                type == TransactionType.DEPOSIT ? account : null);
    }

    //TRANSFER
    public Transaction(TransactionType type, double amount, Account sourceAccount, Account destinationAccount) {
        validateInputs(type, amount, sourceAccount, destinationAccount);

        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.timestamp = LocalDateTime.now();
        this.currency = resolveCurrency(type, sourceAccount, destinationAccount);
    }

    private void validateInputs(TransactionType type, double amount, Account source, Account destination) {
        //Basic validations
        if (type == null) throw new IllegalArgumentException("Transaction type cannot be null.");
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive.");

        //specific validations by transaction type
        switch (type) {
            case WITHDRAWAL:
                if (source == null) throw new IllegalArgumentException("Source account required for withdrawal.");
                break;

            case DEPOSIT:
                if (destination == null)
                    throw new IllegalArgumentException("Destination accounts required for deposit.");
                break;

            case TRANSFER:
                if (source == null || destination == null) {
                    throw new IllegalArgumentException("Both accounts required for transfer");
                }
                if (source == destination) {
                    throw new IllegalArgumentException("Cannot trnasfer to same account");
                }
                if (!source.getCurrency().equals(destination.getCurrency())) {
                    throw new IllegalArgumentException("Currency mismatch between accounts");
                }
                break;
        }

    }

    private CurrencyOptions resolveCurrency(TransactionType type, Account source, Account destination) {
            return switch (type) {
                case WITHDRAWAL, TRANSFER -> source.getCurrency();
                case DEPOSIT -> destination.getCurrency();
            };
    }

    public void execute(){
        switch (type) {
            case WITHDRAWAL -> performWithdrawal();
            case DEPOSIT -> performDeposit();
            case TRANSFER -> performTransfer();
        }
    }

    private void performWithdrawal() {
        sourceAccount.withdraw(amount);
    }

    private void performDeposit() {
        destinationAccount.deposit(amount);
    }

    private void performTransfer() {
        if (sourceAccount.getBalance() < amount) {
            throw new IllegalStateException("Insufficient funds for transfer");
        }

        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    //details
    public void displayTransactionDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("\n==== Transaction Details ====");
        System.out.println("ID: " + uuid);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Timestamp: " + timestamp.format(formatter));

        switch (type) {
            case WITHDRAWAL -> System.out.println("Withdrawn from: " + sourceAccount.getAccountNumber());
            case DEPOSIT -> System.out.println("Deposited to: " + destinationAccount.getAccountNumber());
            case TRANSFER -> System.out.printf("Transfer from %s (%s) to %s (%s)%n",
                    sourceAccount.getAccountHolder(),
                    sourceAccount.getAccountNumber(),
                    destinationAccount.getAccountHolder(),
                    destinationAccount.getAccountNumber());

        }
    }

    // Getters (sin setters para inmutabilidad)
    public String getUuid() { return uuid; }
    public TransactionType getType() { return type; }
    public double getAmount() { return amount; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public CurrencyOptions getCurrency() { return currency; }

}