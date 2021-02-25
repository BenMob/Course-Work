package GameModesGUI;

public class Client{


    public static void main(String[] args){

        /**
         * Creating three Game Mode Panel Factories for each level
         */
        GameModePanelFactoryIF beginnerModeFactory = GameModePanelCreator.createGameModePanel(GameModePanelCreator.Mode.BEGINNER);
        GameModePanelFactoryIF intermediateModeFactory = GameModePanelCreator.createGameModePanel(GameModePanelCreator.Mode.INTERMEDIATE);
        GameModePanelFactoryIF advancedModeFactory = GameModePanelCreator.createGameModePanel(GameModePanelCreator.Mode.ADVANCED);

        /**
         * Creating Weapons and Charcter Selection Panels for each Mode
         * BEGINNER
         * INTERMEDIATE
         * ADVANCED
         */

        System.out.println("Beginner Mode Selected!");
        WeaponsSelectionPanelIF beginnerWeaponsPanel = beginnerModeFactory.createWeaponsPanel();
        beginnerWeaponsPanel.display();

        CharactersSelectionPanelIF beginnerCharactersPanel = beginnerModeFactory.createCharactersPanel();
        beginnerCharactersPanel.display();
        System.out.println();

        System.out.println("Intermediate Mode Selected!");
        WeaponsSelectionPanelIF intermediateWeaponsPanel = intermediateModeFactory.createWeaponsPanel();
        intermediateWeaponsPanel.display();

        CharactersSelectionPanelIF intermediateCharactersPanel = intermediateModeFactory.createCharactersPanel();
        intermediateCharactersPanel.display();
        System.out.println();

        System.out.println("AdvancedMode Mode Selected!");
        WeaponsSelectionPanelIF advancedWeaponsPanel = advancedModeFactory.createWeaponsPanel();
        advancedWeaponsPanel.display();

        CharactersSelectionPanelIF advancedCharactersPanel = advancedModeFactory.createCharactersPanel();
        advancedWeaponsPanel.display();
    }

}