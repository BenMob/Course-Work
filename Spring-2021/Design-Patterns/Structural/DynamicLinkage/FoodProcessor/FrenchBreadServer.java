package FoodProcessor;

public class FrenchBreadServer implements FoodProcessorLoadableServerIF{
    private FoodProcessorOpenAPIIF environment;
    public FrenchBreadServer(){}
    
    @Override
    void setEnvironment(FoodProcessorOpenAPIIF env){
        this.environment = env;
    }
    
    @Override
    void start(){
        System.out.println("Start in FrenchBreadServer!");
    }

    @Override
    String getFood(){
        return "French Bread";
    }
}