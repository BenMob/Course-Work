package FoodProcessor;

public class PizzaServer implements FoodProcessorLoadableServerIF{
    private FoodProcessorOpenAPIIF environment;
    public PizzaServer(){}

    @Override
    void setEnvironment(FoodProcessorOpenAPIIF env){
        this.environment = env;
    }

    @Override
    void start(){
        System.out.println("Start in PizzaServer!");
    }

    @Override
    String getFood(){
        return "Pizza";
    }
}