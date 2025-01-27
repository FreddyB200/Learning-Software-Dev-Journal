package interfaceEjercicio;

import java.sql.SQLOutput;

public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;


    public CreditCard(String paymentMethName, String cardNumber, String expirationDate) {
        super(paymentMethName);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void MakePayment(double amount) {
        System.out.println("Doing payment with credit card is $: " + amount);
    }

    public double calcIRate(double amount, double iRate){
        return  amount * (iRate / 100.0);
    }

}


