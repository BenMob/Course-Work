package FoodProcessor;

public class BagelServer implements FoodProcessorLoadableServerIF{
    private FoodProcessorOpenAPIIF environment;
    public BagelServer(){}

    @Override
    void setEnvironment(FoodProcessorOpenAPIIF env){
        this.environment = env;
    }

    @Override
    void start(){
        System.out.println("Start in BagelServer!");
    }

    @Override
    String getFood(){
        return "Bagel";
    }
}