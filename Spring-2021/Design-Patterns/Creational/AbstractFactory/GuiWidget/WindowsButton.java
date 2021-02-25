package GuiWidget;

public class WindowsButton implements ButtonIF{
    public WindowsButton(){}

    @Override
    public void setBackground(){
        System.out.println("Setting WindowsButton background.");
    }

    @Override
    public void setCallBack(){
        System.out.println("Setting WindowsButton callBack.");
    }
}