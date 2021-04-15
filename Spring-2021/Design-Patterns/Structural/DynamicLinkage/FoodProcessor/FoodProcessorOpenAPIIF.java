package FoodProcessor;

public interface FoodProcessorOpenAPIIF {
    void slice();
    void mix();
    void boil();
    void bake();
    void fry();
    void stir();
    float getTemperature();
    float getSoftness();
}