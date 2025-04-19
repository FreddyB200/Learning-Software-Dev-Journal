package interfaceEjercicio;

public abstract class PaymentMethod implements Payment {
    protected  String paymentMethName;

    public PaymentMethod(String paymentMethName) {
        this.paymentMethName = paymentMethName;
    }


    public void showDetails(){
        System.out.println("payment mothod: "+paymentMethName);
    }

}
