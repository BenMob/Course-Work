package FoodProcessor;


public interface FoodProcessorLoadableServerIF {
    void setEnvironment(FoodProcessorOpenAPIIF env);
    void start();
    String getFood();
}