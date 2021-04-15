public interface HReporter_IF {
    void seeDanger(HReporter_IF reporter, Hazard hazard);
    void setDirectOverseer(HReporter_IF reporter);
    HReporter_IF getDirectOverseer();
}
