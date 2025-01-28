package account;

public class CheckingAccount extends Account{
    private double overtdraftLimit;


    //Business rule 2. "The balance of a Checking Account can be negative but must not exceed the overdraft limit."
    public CheckingAccount(String accountNumber, String accountHolder, double balance, CurrencyOptions currency, double overtdraftLimit) {
        super(accountNumber, accountHolder, balance, currency);
        this.overtdraftLimit = overtdraftLimit;
        //Allowing the account to have a negative balance up to that limit.
        if (balance < overtdraftLimit) throw new IllegalArgumentException("Balance cannot up to the overdraft limit for ur account.");
    }
}







