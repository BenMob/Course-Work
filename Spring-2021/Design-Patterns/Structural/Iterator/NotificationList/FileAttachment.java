package NotificationList;

public class FileAttachment extends Attachment{
    public FileAttachment(){
        System.out.println("Creating File Attachement!");
    }

    public String getType(){
        return "File Attachement!";
    }

    @Override
    public void preview(){
        System.out.println("File Attachment Preview");
    }
}