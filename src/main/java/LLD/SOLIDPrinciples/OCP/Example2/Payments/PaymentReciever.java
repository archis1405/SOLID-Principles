package LLD.SOLIDPrinciples.OCP.Example2.Payments;

import java.util.List;

public class PaymentReciever {

    public void paymentsreciever(List<Payment> payments , String message){
        for(Payment pay : payments){
            pay.recievePayment(message);
        }
    }

}
