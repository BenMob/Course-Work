import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * In this class members are considered to be
 * the employees that this Manager is manging.
 */
public class Manager extends Administrator{

    public Manager(String name,  List<Employee> members) {
        super(name, members);
    }

    @Override
    public void seeDanger(HReporter_IF reporter, Hazard hazard){
        boolean shouldReportToCEO = false;
        // Getting Feedback from supervisors/leaders under this manager
        Iterator<Employee> directAdministrators = this.getMembers().iterator();
        while(directAdministrators.hasNext()){
            DirectAdministrator admin = (DirectAdministrator) directAdministrators.next();

            // If negative feedback, don't inform the CEO
            shouldReportToCEO = admin.getFeedBack();
            if(!shouldReportToCEO){
                return;
            }
        }

        // Report to the CEO
        Employee overseer = (Employee) this.getDirectOverseer();
        if(!shouldReportToCEO && overseer != null){
            overseer.seeDanger(this, hazard);
        }
        this.getDirectOverseer().seeDanger(this, hazard);
    }

    public List<Decision> suggestDecisions(Hazard hazard) {

        // Returning suggested decisions
        return List.of(
                new FileReport(this, 1, hazard),
                new Evacuation(this, 2, hazard),
                new FileReport(this, 3, hazard),
                new Evacuation(this, 4, hazard)
        );
    }
}
