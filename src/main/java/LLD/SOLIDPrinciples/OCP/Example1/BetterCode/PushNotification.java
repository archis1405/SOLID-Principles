package LLD.SOLIDPrinciples.OCP.Example1.BetterCode;

public class PushNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Push : "+message);
    }
}
