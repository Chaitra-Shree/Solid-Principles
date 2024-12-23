package DependencyInversionPrinciple.WithDip;

import DependencyInversionPrinciple.DipViolation.NotificationService;

public class EmailService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending via email: " + message);
    }
}
