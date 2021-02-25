package GameModesGUI;

interface GameModePanelFactoryIF{
    public WeaponsSelectionPanelIF createWeaponsPanel();
    public CharactersSelectionPanelIF createCharactersPanel();
}
