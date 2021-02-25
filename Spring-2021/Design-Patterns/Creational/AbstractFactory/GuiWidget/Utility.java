package GuiWidget;

public class Utility{
    public static GUIWidgetFactoryIF createGUIWidgetFactory(String style){
        if (style.equalsIgnoreCase("MAC")) {
            return new MacGUIWidgetFactory();
        }else if(style.equalsIgnoreCase("WINDOWS")){
            return new WindowsGUIWidgetFactory();
        }else{
            return null;
        }
    }
}