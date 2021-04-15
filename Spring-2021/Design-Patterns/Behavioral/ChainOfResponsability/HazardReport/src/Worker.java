public class Worker extends Employee{

    public Worker(String name){
        super(name);
    }

    public void seeDanger(HReporter_IF reporter, Hazard hazard){
        if(reporter == null){                               // First on the scene
            System.out.println("===================================================");
            hazard = new Hazard("Gas leak", "Urgent",4);
            System.out.println(this.getName()
                    + " has just discovered a " + hazard.getType()
                    + " of level " + hazard.getHazard_level()
                    + " : " + hazard.getDesp());
            Employee overseer = (Employee) this.getDirectOverseer();
            System.out.println("John " + " notifies " + overseer.getName() + " of the leak.");
            fixIt();
            this.getDirectOverseer().seeDanger(this, hazard);
        }else{                                              // Being notified from overseer
            fixIt();
        }
    }

    @Override
    public void evacuate() {
        System.out.println("Employee " + this.getName() + " is evacuating!");
    }

    public void fixIt(){
        System.out.println(this.getName() + " sees the danger and starts fixing it.");
    }
}
