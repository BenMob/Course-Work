package Template;

public class Director{
    public Director(){}
    ProductIF build(AbstractBuilder b){
        b.buildPart1()
                .buildPart2();

        return b.getProduct();
    }
}