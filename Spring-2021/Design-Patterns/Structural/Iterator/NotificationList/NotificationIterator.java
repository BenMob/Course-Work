package NotificationList;

public class NotificationIterator implements NotificationIteratorIF {
    private NotificationCollection collection;
    private int index = 0;

    public NotificationIterator(NotificationCollectionIF collection){
        this.collection = (NotificationCollection)collection;
    }

    @Override
    public boolean hasNext(){
        return index < collection.getLength();
    }

    @Override
    public Notification next(){
        try{
            return collection.getItem(this.index++);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}