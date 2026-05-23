package LLD.SOLIDPrinciples.OCP.Example2.Payments;

public class DebitCard implements Payment{
    @Override
    public void recievePayment(String message) {
        System.out.println("Payment is made via Debit Card : "+message);
    }
}
