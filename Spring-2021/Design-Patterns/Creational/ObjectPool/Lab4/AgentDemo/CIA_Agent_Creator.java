package AgentDemo;

import PoolPattern.ObjectCreation_IF;

public class CIA_Agent_Creator implements ObjectCreation_IF {
    private String[] footPrints = {"@", "#", "$", "*", ".", "?"};
    private int index;

    public CIA_Agent_Creator(){
        this.index = 0;
    }

    @Override
    public Object create() {
        CIA_Agent agent = new CIA_Agent(footPrints[index++]);
        new Thread(agent).start();
        return agent;
    }
}
