package GuiWidget;

public class Client{
    private static void test(){
        GUIWidgetFactoryIF macWidgets = Utility.createGUIWidgetFactory("mac");
        GUIWidgetFactoryIF windowsWidgets = Utility.createGUIWidgetFactory("windows");

        ButtonIF macButton = macWidgets.createButton();
        MenuIF macMenu = macWidgets.createMenu();

        ButtonIF windowsButton = windowsWidgets.createButton();
        MenuIF windowsMenu = windowsWidgets.createMenu();
    }

    public static void main(String[] args){
        test();
    }
}