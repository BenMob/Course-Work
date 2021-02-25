package GameModesGUI;

public class BeginnerWeaponsPanel implements WeaponsSelectionPanelIF {

    private String mode;
    private String controlObject;

    public BeginnerWeaponsPanel(){
        this.mode = "Beginner";
        this.controlObject = "Weapons";
    }

    public String getMode() {
        return mode;
    }

    public BeginnerWeaponsPanel setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getControlObject() {
        return controlObject;
    }

    public BeginnerWeaponsPanel setControlObject(String controlObject) {
        this.controlObject = controlObject;
        return this;
    }

    @Override
    public void display(){
        System.out.println("Mode: " + this.mode + "\tContol Object: " + this.controlObject);
    }
}