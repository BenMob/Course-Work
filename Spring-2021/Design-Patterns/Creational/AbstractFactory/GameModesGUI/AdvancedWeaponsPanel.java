package GameModesGUI;

public class AdvancedWeaponsPanel implements WeaponsSelectionPanelIF {
    private String mode;
    private String controlObject;

    public AdvancedWeaponsPanel(){
        this.mode = "Advanced";
        this.controlObject = "Weapons";
    }

    public String getMode() {
        return mode;
    }

    public AdvancedWeaponsPanel setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getControlObject() {
        return controlObject;
    }

    public AdvancedWeaponsPanel setControlObject(String controlObject) {
        this.controlObject = controlObject;
        return this;
    }

    @Override
    public void display(){
        System.out.println("Mode: " + this.mode + "\tContol Object: " + this.controlObject);
    }
}