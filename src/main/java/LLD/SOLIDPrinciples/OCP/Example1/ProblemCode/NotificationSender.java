package LLD.SOLIDPrinciples.OCP.Example1.ProblemCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes , String message){

        for(NotificationType notificationType : notificationTypes){
            switch (notificationType){
                case SMS:
                    notificationType.sendSMSNotification(message);
                    break;
                case PUSH:
                    notificationType.sendPUSHNotification(message);
                    break;
                case EMAIL:
                    notificationType.sendEMAILNotification(message);
                    break;
            }
        }
    }
}


