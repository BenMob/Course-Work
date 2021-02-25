package GameModesGUI;

public class BeginnerModePanelFactory implements  GameModePanelFactoryIF{
    public BeginnerModePanelFactory(){};

    @Override
    public WeaponsSelectionPanelIF createWeaponsPanel(){
        return new BeginnerWeaponsPanel();
    }

    @Override
    public CharactersSelectionPanelIF createCharactersPanel(){ return new BeginnerCharactersPanel(); }
}