package account;

import java.util.UUID;

public abstract class  Account {

    private final CurrencyOptions currency; //USD, EUR, COP, ETC.
    private String accountNumber;
    private String accountHolder;
    private double balance; //current account balance

    public Account(String accountHolder, CurrencyOptions currency) {
        this.accountNumber = UUID.randomUUID().toString();
        this.accountHolder = accountHolder;
        this.balance = 0;
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

    protected abstract void withdraw(double amount);

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }


}