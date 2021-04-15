package NotificationList;

import java.util.List;
import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;

public class NotificationCollection implements NotificationCollectionIF{
    private List<Notification> items;

    public NotificationCollection(){
        this.items = new ArrayList<>();
    }

    public Notification getItem(int index){
        return index < items.size() ? items.get(index): null;
    }

    public void addItem(String str){
        items.add(new Notification(str));
    }

    public int getLength(){
        return items.size();
    }

    public void link(int index, Attachment attachment){
        System.out.println("Linking the created to Notification " + index);
        attachment.preview();
        this.items.get(index).attach(attachment);
    }

    @Override
    public NotificationIteratorIF createIterator(){
        return new NotificationIterator(this);      // Dependency Injection
    }
}