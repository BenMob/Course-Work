package GuiWidget;

public class MacButton implements ButtonIF{
    public MacButton(){}

    @Override
    public void setBackground(){
        System.out.println("Setting MacButton background.");
    }

    @Override
    public void setCallBack(){
        System.out.println("Setting MacButton callBack.");
    }
}