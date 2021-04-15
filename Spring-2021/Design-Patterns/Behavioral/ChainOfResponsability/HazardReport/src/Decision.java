public abstract class Decision {
    private Manager suggestedBy;
    private Integer priority;
    private Hazard hazard;

    public Decision(Manager suggestedBy, int priority, Hazard hazard){
        this.suggestedBy = suggestedBy;
        this.priority = priority;
        this.hazard = hazard;
    }

    public Integer getPriority() {
        return priority;
    }

    public Decision setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public Hazard getHazard() {
        return hazard;
    }

    public Decision setHazard(Hazard hazard) {
        this.hazard = hazard;
        return this;
    }

    public Manager getSuggestedBy() {
        return suggestedBy;
    }

    public Decision setSuggestedBy(Manager suggestedBy) {
        this.suggestedBy = suggestedBy;
        return this;
    }

    public abstract void execute(CEO commander);

    @Override
    public String toString(){
        return "-DECISION" + "\n Suggested by: " + this.getSuggestedBy().getName() +
                "\nPriority: " + this.getPriority() +
                "\nHazard: " + hazard.toString() + "\n";
    }
}
