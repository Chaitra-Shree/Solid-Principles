package DependencyInversionPrinciple.WithDip;

public class SmsService implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("Sending via sms: " + message);
    }
}
