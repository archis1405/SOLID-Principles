package LLD.SOLIDPrinciples.OCP.Example1.BetterCode;

public class SMSNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS : "+message);
    }
}
