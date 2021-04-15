import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements HReporter_IF{
    private String name;
    private Administrator overseer;
    public static List<Employee> safeZone = new ArrayList<>();

    public Employee(String name){
        this.name = name;
        this.overseer = null;
    }

    @Override
    public abstract void seeDanger(HReporter_IF reporter, Hazard hazard);

    @Override
    public HReporter_IF getDirectOverseer() {
        return this.overseer;
    }

    @Override
    public void setDirectOverseer(HReporter_IF reporter) {
        this.overseer = (Administrator) reporter;
    }

    public abstract void evacuate();

    public String getName() {
        return name;
    }
}
