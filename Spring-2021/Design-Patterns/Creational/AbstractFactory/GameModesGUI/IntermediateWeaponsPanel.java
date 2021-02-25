package GameModesGUI;


public class IntermediateWeaponsPanel implements WeaponsSelectionPanelIF {

    private String controlObject;
    private String mode;

    public IntermediateWeaponsPanel(){
        this.mode = "Intermediate";
        this.controlObject = "Weapons";
    }

    public String getMode() {
        return mode;
    }

    public IntermediateWeaponsPanel setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getControlObject() {
        return controlObject;
    }

    public IntermediateWeaponsPanel setControlObject(String controlObject) {
        this.controlObject = controlObject;
        return this;
    }

    @Override
    public void display(){
        System.out.println("Mode: " + this.mode + "\tContol Object: " + this.controlObject);
    }
}