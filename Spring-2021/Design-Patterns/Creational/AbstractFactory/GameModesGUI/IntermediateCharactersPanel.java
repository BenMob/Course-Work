package GameModesGUI;

public class IntermediateCharactersPanel implements CharactersSelectionPanelIF {

    private String mode;
    private String controlObject;

    public IntermediateCharactersPanel(){
        this.mode = "Intermediate";
        this.controlObject = "Characters";
    }

    public String getMode() {
        return mode;
    }

    public IntermediateCharactersPanel setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getControlObject() {
        return controlObject;
    }

    public IntermediateCharactersPanel setControlObject(String controlObject) {
        this.controlObject = controlObject;
        return this;
    }

    @Override
    public void display(){
        System.out.println("Mode: " + this.mode + "\tContol Object: " + this.controlObject);
    }
}