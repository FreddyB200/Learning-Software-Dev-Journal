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


    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if (balance < 0 ) throw new IllegalArgumentException(("balance cannot be  negative"));
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