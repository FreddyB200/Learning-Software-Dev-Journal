package account;

public class CheckingAccount extends Account {
    private double overdraftLimit; // Corrección en el nombre de la variable


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
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        this.balance -= amount;
    }
}






