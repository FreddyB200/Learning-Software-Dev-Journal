package account;

public class CheckingAccount extends Account {
    private double overdraftLimit; // Corrección en el nombre de la variable

    // Business rule 2: "The balance of a Checking Account can be negative but must not exceed the overdraft limit."


    public CheckingAccount(String accountHolder, double balance, CurrencyOptions currency, double overdraftLimit) {
        super(accountHolder, balance, currency);
        this.overdraftLimit = overdraftLimit;
        // business rule validation
        if (balance < -overdraftLimit) {
            throw new IllegalArgumentException("Balance cannot exceed the overdraft limit.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        this.balance -= amount;
    }
}






