public class FileReport extends Decision{
    public FileReport(Manager suggestedBy, int priority, Hazard hazard) {
        super(suggestedBy, priority, hazard);
    }

    @Override
    public void execute(CEO commander){
        System.out.println("The city’s environmental department is notified");
        System.out.println();
        System.out.println("-----------------Time to Evacuate------------------");
    }
}
