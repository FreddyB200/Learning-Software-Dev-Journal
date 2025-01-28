package account;

public class CheckingAccount extends Account{
    private double overtdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, String currency, double overtdraftLimit) {
        super(accountNumber, accountHolder, balance, currency);
        this.overtdraftLimit = overtdraftLimit;
    }



}
