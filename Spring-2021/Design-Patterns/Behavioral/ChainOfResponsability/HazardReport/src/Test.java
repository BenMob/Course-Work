import java.util.List;

public class Test {
    public static void main(String[] args){
        //CompanyXYZ company = new CompanyXYZ();
        // company.runHazardReportDrill();

        // creating list of regular employees with supervisor jack
        Employee nick = new Worker("Nick");
        Employee john = new Worker("John");
        Employee mary = new Worker("Mary");
        Employee jane = new Worker("Jane");
        Employee tom = new Worker("Tom");

        List<Employee> employee_set_1 = List.of(nick, john, mary, jane, tom);
        Employee jack = new Supervisor("Jack",employee_set_1);
        for (Employee e1 : employee_set_1)
            e1.setDirectOverseer(jack);

        // creating list of regular employees with supervisor jeff
        Employee rob = new Worker("Rob");
        Employee ed = new Worker("Ed");
        Employee rick = new Worker("Rick");
        Employee michael = new Worker("Michael");

        List<Employee> employee_set_2 = List.of(rob, ed, rick, michael);
        Employee jeff = new Supervisor("Jeff",employee_set_2);
        for (Employee e2 : employee_set_2)
            e2.setDirectOverseer(jeff);

        // creating list of regular employees with project leader chuck
        Employee joe = new Worker("Joe");
        Employee frank = new Worker("Frank");
        Employee sam = new Worker("Sam");
        Employee greg = new Worker("Greg");

        List<Employee> employee_set_3 = List.of(joe, frank, sam, greg);
        Employee chuck = new ProjectLeader("Chuck",employee_set_3);
        for (Employee e3 : employee_set_3)
            e3.setDirectOverseer(chuck);

        // creating list of regular employees with project leader jeff
        Employee amy = new Worker("Amy");
        Employee will = new Worker("Will");
        Employee nancy = new Worker("Nancy");
        Employee adam = new Worker("Adam");

        List<Employee> employee_set_4 = List.of(amy, will, nancy, adam);
        Employee denise = new ProjectLeader("Denise",employee_set_4);
        for (Employee e4 : employee_set_4)
            e4.setDirectOverseer(denise);

        List<Employee> supervisor_set_1 = List.of(jack,jeff);
        Employee bob = new Manager("Bob", supervisor_set_1);
        for (Employee s1 : supervisor_set_1)
            s1.setDirectOverseer(bob);

        List<Employee> supervisor_set_2 = List.of(chuck, denise);
        Employee rachel = new Manager("Rachel", supervisor_set_2);
        for (Employee s1 : supervisor_set_2)
            s1.setDirectOverseer(rachel);

        List<Employee> ceo_set_1 = List.of(bob, rachel);
        Employee steve = new CEO("Steve", ceo_set_1);
        for (Employee m1 : ceo_set_1)
            m1.setDirectOverseer(steve);

        //hazard
        Hazard h1 = new Hazard("Gas leak", "something",4);

        john.seeDanger(null, null);

    }
}

