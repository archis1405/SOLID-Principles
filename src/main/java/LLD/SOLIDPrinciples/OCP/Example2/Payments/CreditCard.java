package LLD.SOLIDPrinciples.OCP.Example2.Payments;

public class CreditCard implements Payment{
    @Override
    public void recievePayment(String message) {
        System.out.println("Payment made with credit card : "+message);
    }
}
