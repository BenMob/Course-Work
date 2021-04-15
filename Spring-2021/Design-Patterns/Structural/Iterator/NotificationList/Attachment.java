package NotificationList;

public abstract class Attachment {
    public Attachment(){};
    public void preview(){
        System.out.println("Calling Preview() from Attachement");
    }
}