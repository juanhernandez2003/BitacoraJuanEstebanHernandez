public class Main {

    public static void main(String[] args) {

        NotificationService service = NotificationService.getInstance();

        service.setStrategy(new EmailNotification());
        service.sendNotification("Hola por correo");

        service.setStrategy(new SMSNotification());
        service.sendNotification("Hola por SMS");

        service.setStrategy(new PushNotification());
        service.sendNotification("Hola por Push");
    }
}