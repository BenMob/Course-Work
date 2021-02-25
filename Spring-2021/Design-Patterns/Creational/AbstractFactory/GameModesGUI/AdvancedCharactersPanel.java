package GameModesGUI;

public class AdvancedCharactersPanel implements CharactersSelectionPanelIF {
    private String mode;
    private String controlObject;

    public AdvancedCharactersPanel(){
        this.mode = "Advanced";
        this.controlObject = "Characters";
    }

    public String getMode() {
        return mode;
    }

    public AdvancedCharactersPanel setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getControlObject() {
        return controlObject;
    }

    public AdvancedCharactersPanel setControlObject(String controlObject) {
        this.controlObject = controlObject;
        return this;
    }

    @Override
    public void display(){
        System.out.println("Mode: " + this.mode + "\tContol Object: " + this.controlObject);
    }
}