package account;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, CurrencyOptions currency, double interestRate) {
        super(accountNumber, accountHolder, balance, currency);
        //Business rule 1. "The balance of a Savings Account cannot be less than 0."
        if (balance <=0) throw new IllegalArgumentException("Balance cannot be less than 0.");
        if (interestRate < 0) throw new IllegalArgumentException("Interest rate cannot be negative.");
        this.interestRate = interestRate;
    }



    public void applyInterest(int years){
        if (years <= 0) throw new IllegalArgumentException("Years must be positive.");
        double currentBalance = getBalance();
        if (interestRate > 0){
            double interest = interestRate * currentBalance * years;
            setBalance(currentBalance + interest);
        } else {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
    }
}
