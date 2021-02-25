package GuiWidget;

public class WindowsMenu implements MenuIF{
    public WindowsMenu(){}

    @Override
    public void addItem(){
        System.out.println("Addint item to Windows menu.");
    }

    @Override
    public void addSubMenu(){
        System.out.println("Addig sub menu to Windows menu.");
    }
}