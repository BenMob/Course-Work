package GuiWidget;

public class MacGUIWidgetFactory implements GUIWidgetFactoryIF{
    public MacGUIWidgetFactory(){}
    @Override
    public ButtonIF createButton(){
        System.out.println("Creating Mac Button.");
        return new MacButton();
    }

    @Override
    public MenuIF createMenu(){
        System.out.println("Creating Mac Menu");
        return new MacMenu();
    }
}