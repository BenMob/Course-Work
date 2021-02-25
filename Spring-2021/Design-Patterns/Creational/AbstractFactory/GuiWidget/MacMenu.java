package GuiWidget;

public class MacMenu implements MenuIF{
    public MacMenu(){}

    @Override
    public void addItem(){
        System.out.println("Addint item to Mac menu.");
    }

    @Override
    public void addSubMenu(){
        System.out.println("Addig sub menu to Mac menu.");
    }
}