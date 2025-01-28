package account;

import java.util.UUID;

public abstract class  Account {

    private final CurrencyOptions currency; //USD, EUR, COP, ETC.
    private String accountNumber;
    private String accountHolder;
    protected double balance; //current account balance

    public Account(String accountHolder, double balance, CurrencyOptions currency) {
        this.accountNumber = UUID.randomUUID().toString();
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.currency = currency;
    }

    public void addToBalance(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount should be positive");
        }
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public CurrencyOptions getCurrency() {
        return currency;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String checkBalance() {
        return "The current balance is: " + balance;
    }


    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

}