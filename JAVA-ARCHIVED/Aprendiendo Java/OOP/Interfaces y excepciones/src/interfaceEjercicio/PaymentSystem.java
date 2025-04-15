package interfaceEjercicio;

public class PaymentSystem {
    public static void main(String[] args) {

        CreditCard method1 = new CreditCard("credit card", "2141231321", "05/26");


        method1.showDetails();

        method1.MakePayment(10000);

        double interestRate = method1.calcIRate(10000, 5);
        System.out.println("Interest rate: "+interestRate);

        Cash dinero = new Cash("Cash");

        dinero.showDetails();
        dinero.MakePayment(15000);
        double cashExchange = dinero.CalcExchange(15000, 50000);
        System.out.println("The cash exchange is: $ "+ cashExchange);



    }
}
