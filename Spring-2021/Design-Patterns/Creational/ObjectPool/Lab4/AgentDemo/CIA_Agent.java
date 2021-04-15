package AgentDemo;

public class CIA_Agent implements Agent_IF, Runnable{
    private boolean workingInProgress;
    private String myFootPrint;
    private int taskId;

    private void processing(){
        System.out.println("CIA Agent " + myFootPrint + " is performing task " + taskId);
    }

    public CIA_Agent(String footPrint){
        this.myFootPrint = footPrint;
        this.workingInProgress = false;
    }

    @Override
    public void startTask() {
        this.processing();
        workingInProgress = true;
    }

    @Override
    public void stopTask() {
        workingInProgress = false;
    }

    @Override
    public void setTaskID(int id) {
        this.taskId = id;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while(true){
            if (workingInProgress){
                try {
                    Thread.sleep(100);
                    this.processing();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
