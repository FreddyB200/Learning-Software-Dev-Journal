package account;

public abstract class  Account {
    private String accountNumber;
    private String accountHolder;
    private double balance; //current account balance
    private String currency; //USD, EUR, COP, ETC.

    public Account(String accountNumber, String accountHolder, double balance, String currency) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.currency = currency;
    }

    protected void addToBalance(double amount){
        this.balance += amount;
    }

    protected double getBalance(){
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount should be positive.");
        }
    }

    public void withdraw(double amount){
        if (balance > 0 && amount > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Error Balance or amount are not positive.");
        }
    }

    public void checkBalance(){
        System.out.println("The current balanace is: " + balance);
    }


}
