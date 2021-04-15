import java.util.ArrayList;

import java.util.List;

public class CompanyXYZ {

    private Employee jack;           // Supervisor of John, Mary, Jane, Tom and Nick
    private Employee jeff;           // Supervisor of Rob, Ed, Rick and Michael
    private Employee chuck;          // Leader of Joe, Frank, Sam and Greg
    private Employee denise;         // Leader of Amy, Wil, Nancy and Adam
    private Employee bob;            // Manager of Jack and Jeff
    private Employee rachel;         // Manager of Chuck and Denise
    private Employee john;           // Regular worker
    private Employee mary;           // Regular worker
    private Employee jane;           // Regular worker
    private Employee tom;            // Regular worker
    private Employee nick;           // Regular worker
    private Employee rob;            // Regular worker
    private Employee ed;             // Regular worker
    private Employee rick;           // Regular worker
    private Employee michael;        // Regular worker
    private Employee joe;            // Regular worker
    private Employee frank;          // Regular worker
    private Employee sam;            // Regular worker
    private Employee greg;           // Regular worker
    private Employee amy;            // Regular worker
    private Employee wil;            // Regular worker
    private Employee nancy;          // Regular worker
    private Employee adam;           // Regular worker
    private Employee steve;          // CEO

    private List<Employee> office1;
    private List<Employee> office2;
    private List<Employee> office3;
    private List<Employee> office4;

    private List<Employee> department1;
    private List<Employee> department2;

    public CompanyXYZ(){
        this.hireWorkers()
                .onBoardWorkers()
                .hireAdministrators()
                .onBoardAdministrators()
                .hireManagers()
                .onBoardManagers()
                .appointCEO();
    }

    public CompanyXYZ hireWorkers(){
        // Supervised by Jack
        john = new Worker("John");
        mary = new Worker("Mary");
        jane = new Worker("Jane");
        tom = new Worker("Tom");
        nick = new Worker("Nick");
        office1 = List.of(john, mary, jane, tom, nick);

        jack = new Supervisor("Jack", office1);
        for(Employee employee: office1){
            employee.setDirectOverseer(jack);
        }

        // Supervised by Jeff
        rob = new Worker("Rob");
        ed = new Worker("Ed");
        rick = new Worker("Rick");
        michael = new Worker("Michael");
        office2 = List.of(rob, ed, rick, michael);

        jeff = new Supervisor("Jeff", office2);
        for(Employee employee: office2){
            employee.setDirectOverseer(jeff);
        }

        // Lead by Chuck
        joe = new Worker("Joe");
        frank = new Worker("Frank");
        sam = new Worker("Sam");
        greg = new Worker("Greg");
        chuck = new ProjectLeader("Chuck", office3);
        for(Employee employee: office3){
            employee.setDirectOverseer(chuck);
        }

        // Lead by Denise
        amy = new Worker("Amy");
        wil = new Worker("Wil");
        nancy = new Worker("Nancy");
        adam = new Worker("Adam");

       return this;
    }

    public CompanyXYZ onBoardWorkers(){
        john.setDirectOverseer(jack);
        mary.setDirectOverseer(jack);
        jane.setDirectOverseer(jack);
        tom.setDirectOverseer(jack);
        nick.setDirectOverseer(jack);

        rob.setDirectOverseer(jeff);
        ed.setDirectOverseer(jeff);
        rick.setDirectOverseer(jeff);
        michael.setDirectOverseer(jeff);

        joe.setDirectOverseer(chuck);
        frank.setDirectOverseer(chuck);
        sam.setDirectOverseer(chuck);
        greg.setDirectOverseer(chuck);

        amy.setDirectOverseer(denise);
        wil.setDirectOverseer(denise);
        nancy.setDirectOverseer(denise);
        adam.setDirectOverseer(denise);

        return this;
    }

    public CompanyXYZ hireAdministrators(){
        jack = new Supervisor("Jack", List.of(john, mary, jane, tom, nick));
        jeff = new Supervisor("Jeff", List.of(rob, ed, rick, michael));
        chuck = new ProjectLeader("Chuck", List.of(joe,frank, sam, greg));
        denise = new ProjectLeader("Denise", List.of(amy, wil, nancy, adam));
        return this;
    }

    public CompanyXYZ onBoardAdministrators(){
        jack.setDirectOverseer(bob);
        jeff.setDirectOverseer(bob);
        chuck.setDirectOverseer(rachel);
        denise.setDirectOverseer(rachel);
        return this;
    }

    public CompanyXYZ hireManagers(){
        bob = new Manager("Bob", List.of(jack, jeff));
        rachel = new Manager("Rachel", List.of(chuck, denise));
        return this;
    }

    public CompanyXYZ onBoardManagers(){
        bob.setDirectOverseer(steve);
        rachel.setDirectOverseer(bob);
        return this;
    }

    public CompanyXYZ appointCEO(){
        steve = new CEO("Steve", List.of(bob, rachel));
        return this;
    }

    public void runHazardReportDrill(){
        Hazard hazard = new Hazard("Fire", "Urgent", 8);
        john.seeDanger(john, hazard);
    }
}


