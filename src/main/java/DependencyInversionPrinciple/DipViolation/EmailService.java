package DependencyInversionPrinciple.DipViolation;

// Without DIP - Notification service directly depends on Email service
public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
