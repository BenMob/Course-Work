package NotificationList;

public class Demo{
    public static void main(String[] args){
        NotificationCollection notifications =  new NotificationCollection();  // Creating an empty Notification Collection

        /******* Phase 1 *************/
        // Populating the NotificationCollection with 6 notifications
        notifications.addItem("Notification 1");
        notifications.addItem("Notification 2");
        notifications.addItem("Notification 3");
        notifications.addItem("Notification 4");
        notifications.addItem("Notification 5");
        notifications.addItem("Notification 6");

        // Creating a notification bar and printing notifications
        NotificationBar nBar = new NotificationBar(notifications);
        nBar.printNotifications();

        Attachment media = new MediaAttachment();  // Attachement created without any Notification attached to it
        Attachment file = new FileAttachment();    // Attachement created without any Notification attached to it
        System.out.println();


        /******* Phase 2 *************/
        // Linking first 3 notifications to the same Attachment Object
        notifications.link(0, media);
        notifications.link(1, media);
        notifications.link(2, media);

        // Linking next 3 notifications to the same Attachment Object
        notifications.link(3, file);
        notifications.link(4, file);
        notifications.link(5, file);
    }
}