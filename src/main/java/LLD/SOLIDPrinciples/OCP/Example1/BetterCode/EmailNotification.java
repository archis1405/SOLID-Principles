package LLD.SOLIDPrinciples.OCP.Example1.BetterCode;

public class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email : "+message);
    }
}
