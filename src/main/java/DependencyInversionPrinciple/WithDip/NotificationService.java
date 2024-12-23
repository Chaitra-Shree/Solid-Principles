package DependencyInversionPrinciple.WithDip;

//High level module NotificationService depends on interface NotificationSender
public class NotificationService {

    private NotificationSender notificationSender;

    // Constructor takes NotificationSender, allowing for flexibility
    NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void send(String message) {
        notificationSender.send(message);
    }
}
