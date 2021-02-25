package GameModesGUI;

public class IntermediateModePanelFactory implements  GameModePanelFactoryIF{
    public IntermediateModePanelFactory(){};

    @Override
    public WeaponsSelectionPanelIF createWeaponsPanel(){
        return new IntermediateWeaponsPanel();
    }

    @Override
    public CharactersSelectionPanelIF createCharactersPanel(){ return new IntermediateCharactersPanel(); }
}