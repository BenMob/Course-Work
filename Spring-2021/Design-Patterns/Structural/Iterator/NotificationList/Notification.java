package NotificationList;

public class Notification {
    private String content;
    private Attachment attachment;

    public Notification(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void attach(Attachment attachment){
        System.out.println("Attachment Linked!");
        this.attachment = attachment;
    }
}