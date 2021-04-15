package AgentDemo;

import PoolPattern.ObjectPool;

public class FBIAgentApp {

    public static void main(String[] args){

        ObjectPool server = ObjectPool.getPoolInstance(new FBI_Agent_Creator(), 5);
        for(int task = 0; task < 10; task++){
            Thread client = new Thread(new TaskRequester(server, task));
            client.start();
        }
    }
}
