package DependencyInversionPrinciple.DipViolation;

// Without DIP - Notification service directly depends on Email service
/*
Tight Coupling: The high-level module (NotificationService) is directly tied to a specific low-level implementation (EmailService). Changes in the low-level module require changes in the high-level module.
Lack of Flexibility: Switching to another notification type (e.g., SMS or push notifications) is not possible without modifying the existing code.
 */
public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        emailService = new EmailService();  // Tight coupling to email service
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}
