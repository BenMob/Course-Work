package NotificationList;

public class NotificationBar {
    private NotificationCollectionIF notifications;

    public NotificationBar(NotificationCollectionIF notifications){
        this.notifications = notifications;
    }

    /**
     * Printing notifications using an iterator
     */
    public void printNotifications(){
        NotificationIteratorIF iterator = notifications.createIterator();
        System.out.println("\nNOTIFICATIONS:\n");

        while(iterator.hasNext()){
            Notification n = iterator.next();
            System.out.println(n.getContent());
        }

        System.out.println();
    }
}