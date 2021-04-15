public class Hazard {

    private String type;
    private String desp;
    private int hazard_level;

    public Hazard(String type, String desp, int hazard_level){
        this.type = type;
        this.desp = desp;
        this.hazard_level = hazard_level;
    }

    public String getType() {
        return type;
    }

    public Hazard setType(String type) {
        this.type = type;
        return this;
    }

    public String getDesp() {
        return desp;
    }

    public Hazard setDesp(String desp) {
        this.desp = desp;
        return this;
    }

    public int getHazard_level() {
        return hazard_level;
    }

    public Hazard setHazard_level(int hazard_level) {
        this.hazard_level = hazard_level;
        return this;
    }

    @Override
    public String toString(){
        return this.getType();
    }
}
