package NotificationList;

public class MediaAttachment extends Attachment{
    public MediaAttachment(){
        System.out.println("Creating Media Attachement");
    }

    @Override
    public void preview(){
        System.out.println("Media Attachment Preview");
    }
}