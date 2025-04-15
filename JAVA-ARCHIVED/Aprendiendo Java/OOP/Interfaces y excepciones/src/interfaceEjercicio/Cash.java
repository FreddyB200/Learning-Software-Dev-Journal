package interfaceEjercicio;

public class Cash extends PaymentMethod {
    public Cash(String paymentMethName) {
        super(paymentMethName);
    }

    @Override
    public void MakePayment(double amount) {
        System.out.println("Doing payment in cash: $" + amount);
    }


    public double CalcExchange(double amount, double amountPaid) {
        return amountPaid - amount;
    }

}

