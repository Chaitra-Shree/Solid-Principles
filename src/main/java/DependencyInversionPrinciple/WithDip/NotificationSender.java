package DependencyInversionPrinciple.WithDip;

// Abstraction for sending messages
public interface NotificationSender {
    void send(String message);
}
