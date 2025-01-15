package exercise4;

public abstract class Notification {
    public String sender;
    public String receiver;
    public String notificationText;

    public Notification(String sender, String receiver, String notificationText) {
        this.sender = sender;
        this.receiver = receiver;
        this.notificationText = notificationText;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public abstract void send();
    public abstract void receive();
}

