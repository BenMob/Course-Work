package Template;

public class ConcreteBuilderA extends AbstractBuilder{
    public ConcreteBuilderA(){
        this.description = "A";
    }
    public ProductIF getProduct(){
        return new ConcreteProductA(this);
    }
}