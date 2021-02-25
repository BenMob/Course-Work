package GuiWidget;

public class WindowsGUIWidgetFactory implements GUIWidgetFactoryIF{
    public WindowsGUIWidgetFactory(){}

    @Override
    public ButtonIF createButton(){
        System.out.println("Creating Windows Button.");
        return new WindowsButton();
    }

    @Override
    public MenuIF createMenu(){
        System.out.println("Creating Windows Menu");
        return new WindowsMenu();
    }
}