package GameModesGUI;

public class BeginnerCharactersPanel implements CharactersSelectionPanelIF {

    private String mode;
    private String controlObject;

    public BeginnerCharactersPanel(){
        this.mode = "Beginner";
        this.controlObject = "Characters";
    }

    public String getMode() {
        return mode;
    }

    public BeginnerCharactersPanel setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getControlObject() {
        return controlObject;
    }

    public BeginnerCharactersPanel setControlObject(String controlObject) {
        this.controlObject = controlObject;
        return this;
    }

    @Override
    public void display(){
        System.out.println("Mode: " + this.mode + "\tContol Object: " + this.controlObject);
    }
}