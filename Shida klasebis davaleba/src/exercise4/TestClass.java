package exercise4;

public class TestClass {
    public static void main(String[] args) {
        Notification notification = new Notification("Tazo", "Lasha", "Hello.") {
            @Override
            public void send() {
                System.out.println("Sending SMS from " + sender + " to " + receiver + ": " + notificationText);
            }

            @Override
            public void receive() {
                System.out.println(receiver + " has received the SMS: " + notificationText);
            }
        };

        notification.send();
        notification.receive();
    }
}
