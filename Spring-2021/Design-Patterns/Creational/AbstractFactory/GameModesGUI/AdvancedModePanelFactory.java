package GameModesGUI;


public class AdvancedModePanelFactory implements  GameModePanelFactoryIF{
    public AdvancedModePanelFactory(){};

    @Override
    public WeaponsSelectionPanelIF createWeaponsPanel(){
        return new AdvancedWeaponsPanel();
    }

    @Override
    public CharactersSelectionPanelIF createCharactersPanel(){ return new AdvancedCharactersPanel(); }
}