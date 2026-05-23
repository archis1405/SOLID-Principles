package LLD.SOLIDPrinciples.OCP.Example2.Payments;

public class UPI implements Payment{
    @Override
    public void recievePayment(String message) {
        System.out.println("UPI payment recieved : "+message);
    }
}
