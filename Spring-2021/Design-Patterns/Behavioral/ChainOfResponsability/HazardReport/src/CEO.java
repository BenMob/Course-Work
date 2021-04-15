import java.util.*;

public class CEO extends Administrator{
    public CEO(String name, List<Employee> members) {
        super(name, members);
    }

    @Override
    public void seeDanger(HReporter_IF reporter, Hazard hazard){
        List<Decision> decisions = new ArrayList<>();

        Iterator<Employee> managers = this.getMembers().iterator();
        while(managers.hasNext()){
            Manager currentManager = (Manager) managers.next();
            decisions.addAll(currentManager.suggestDecisions(hazard));
        }

        this.implementDecision(decisions);  // Making final decision
    }

    public void implementDecision(List<Decision> decisions){
        List<Decision> sortedDecisions = sortByPriority(decisions);  // Sorting decisions by priority
        sortedDecisions.get(0).execute(this);  // From FileReport
        sortedDecisions.get(2).execute(this);  // From Evacuation
    }

    public List<Decision> sortByPriority(List<Decision> decisions){
       Collections.sort(decisions, Comparator.comparing(Decision::getPriority));
       return decisions;
    }

    public void report(){
        System.out.println("\nEveryone has been safely evacuated!");
        System.out.println("COMPANY XYZ WILL NOT BE SUED!");
    }
}
