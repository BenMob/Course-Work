import java.util.Iterator;
import java.util.List;

public abstract class DirectAdministrator extends Administrator{

    public DirectAdministrator(String name, List<Employee> members) {
        super(name, members);
    }

    @Override
    public void seeDanger(HReporter_IF reporter, Hazard hazard){

        /**
         * Ask members to start working on fixing the hazard
         */
        Iterator<Employee> workers = getMembers().iterator();
        while(workers.hasNext()){
            Worker worker = (Worker)workers.next();
            if(worker != reporter){
                worker.seeDanger(this, hazard);
            }
        }

        /**
         * Report to manager
         */
        Employee overseer = (Employee) this.getDirectOverseer();
        if(overseer != null){
            System.out.println(this.getName() + " notifies " + overseer.getName() + " of the issue!");
            overseer.seeDanger(this, hazard);
        }
    }

    public boolean getFeedBack(){
        System.out.println("FeedBack by " + this.getName() + " is positive");
        return true;
    }
}
