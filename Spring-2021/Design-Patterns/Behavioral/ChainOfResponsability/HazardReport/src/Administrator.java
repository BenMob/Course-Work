
import java.util.Iterator;
import java.util.List;

public abstract class Administrator extends Employee{

    private List<Employee> members;

    public Administrator(String name, List<Employee> members) {
        super(name);
        this.members = members;
    }

    public abstract void seeDanger(HReporter_IF reporter, Hazard hazard);

    @Override
    public void evacuate(){
        System.out.print(this.getName() + " is ordering ");
        for(Employee employee: this.getMembers()){
            System.out.print(", " + employee.getName());
        }
        System.out.println(" to evacuate.");
        if(this.getMembers() != null){
            Iterator<Employee> employees = this.getMembers().iterator();
            while(employees.hasNext()){
                Employee employee = employees.next();
                employee.evacuate();
            }
        }
        System.out.println("Employee " + this.getName() + " is evacuating!");
    }

    public List<Employee> getMembers(){
        return this.members;
    }
}
