package GameModesGUI;

public class GameModePanelCreator{
    public static enum Mode{
        BEGINNER,
        INTERMEDIATE,
        ADVANCED
    }

    public static GameModePanelFactoryIF createGameModePanel(Mode mode){
        switch (mode){
            case BEGINNER:
                return new BeginnerModePanelFactory();
            case INTERMEDIATE:
                return new IntermediateModePanelFactory();
            case ADVANCED:
                return new AdvancedModePanelFactory();
            default:
                return null;
        }
    }
}