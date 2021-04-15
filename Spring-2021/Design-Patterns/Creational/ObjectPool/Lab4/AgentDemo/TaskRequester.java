package AgentDemo;

import PoolPattern.ObjectPool;

public class TaskRequester implements Runnable{
    private ObjectPool server;
    private int taskId;

    public TaskRequester(ObjectPool p, int id){
        this.server = p;
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
        Agent_IF agent = (Agent_IF)server.getObject();    // Tries to get an agent from the pool.
        if(agent == null){                                // No agent was returned because all agents are busy
            try {
                agent = (Agent_IF)server.waitForObject(); // Wait for the next available agent
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        agent.setTaskID(taskId);
        agent.startTask();                                // Start task
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        agent.stopTask();                                 // Stop task
        server.release(agent);                            // Release Agent
    }
}
