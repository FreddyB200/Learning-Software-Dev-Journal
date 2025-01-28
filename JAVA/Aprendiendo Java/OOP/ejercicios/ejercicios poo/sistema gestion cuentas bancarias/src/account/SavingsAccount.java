package account;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, String currency, double interestRate) {
        super(accountNumber, accountHolder, balance, currency);
        this.interestRate = interestRate;
    }

    public void applyInterest(int years){
        double currentBalance = getBalance();
        if (interestRate > 0){
            interestRate /= 100;
            double interest = interestRate * currentBalance * years;
            setBalance(currentBalance + interest);
        } else {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
    }
}
