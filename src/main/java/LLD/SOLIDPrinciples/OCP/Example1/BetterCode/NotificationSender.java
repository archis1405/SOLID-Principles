package LLD.SOLIDPrinciples.OCP.Example1.BetterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<Notification> notifications , String message){

        for(Notification notification : notifications){

            notification.sendMessage(message);

        }
    }
}

/*
    Now the class do not have a restriction on the type of notification ,
    If we add a new type of notification we need to just adda new class with the logic
    corresponding to the new notification type
*/
