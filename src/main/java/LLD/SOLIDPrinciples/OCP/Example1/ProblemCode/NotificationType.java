package LLD.SOLIDPrinciples.OCP.Example1.ProblemCode;

public enum NotificationType {
    SMS,
    EMAIL,
    PUSH;

    public void sendSMSNotification(String message){
        System.out.println("SMS : "+message);
    }

    public void sendEMAILNotification(String message){
        System.out.println("EMAIL : "+message);
    }

    public void sendPUSHNotification(String message){
        System.out.println("PUSH : "+message);
    }
}

