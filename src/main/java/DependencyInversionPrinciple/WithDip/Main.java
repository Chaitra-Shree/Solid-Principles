package DependencyInversionPrinciple.WithDip;

public class Main {
    public static void main(String[] args) {
        // Using EmailSender as NotificationSender
        NotificationSender emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.send("Hi via email");

        // Switching to SMS service without changing the NotificationService
        NotificationSender smsService = new SmsService();
        notificationService = new NotificationService(smsService);
        notificationService.send("Hi via SMS");

    }
}
