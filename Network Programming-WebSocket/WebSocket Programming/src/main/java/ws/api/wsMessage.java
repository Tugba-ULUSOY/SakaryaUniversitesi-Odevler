package ws.api;

public class wsMessage {

    private String sender;
    private String message;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "wsMessage{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
