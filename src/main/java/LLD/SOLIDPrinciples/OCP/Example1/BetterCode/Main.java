package LLD.SOLIDPrinciples.OCP.Example1.BetterCode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notification smsNotification = new SMSNotification();
        Notification emailNotification = new EmailNotification();
        Notification pushNotification = new PushNotification();

        List<Notification> notifications = new ArrayList<>(){{
            add(smsNotification);
            add(emailNotification);
            add(pushNotification);
        }};

        // for user input we can expect the type of notification too so here we will put an if-else

        Scanner in = new Scanner(System.in);
        int i = 0;

        while(i<5){
            String notificationType = in.next();

            if(notificationType == "SMS"){
                notifications.add(new SMSNotification());
            }
            else if(notificationType == "EMAIL"){
                notifications.add(new EmailNotification());
            }
            else{
                notifications.add(new PushNotification());
            }
            i++;
        }
    }
}
