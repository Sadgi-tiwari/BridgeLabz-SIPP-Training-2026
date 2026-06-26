public class Main {

    public static void main(String[] args) {

        Notification[] notifications = {

                new EmailNotification("Sadgi", "Welcome to our service!"),

                new SmsNotification("Rahul", "Your OTP is 456789."),

                new PushNotification("Priya", "You have a new message.")
        };

        System.out.println("Sent Notifications:\n");

        // Dynamic Method Dispatch
        for (Notification notification : notifications) {
            notification.sendNotification();
            System.out.println("----------------------------");
        }
    }
}
