package account;

public class CheckingAccount extends Account {
    private double overdraftLimit; // Corrección en el nombre de la variable


    public CheckingAccount(String accountHolder, CurrencyOptions currency, double overdraftLimit) {
        super(accountHolder, currency);
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft cannot be negative.");
        }
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    protected void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (getBalance() - amount < -overdraftLimit) {
            throw new IllegalArgumentException("Exceeds overdraft limit.");
        }

        setBalance(getBalance()-amount);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}






