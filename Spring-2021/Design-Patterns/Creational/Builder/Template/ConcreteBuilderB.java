package Template;

public class ConcreteBuilderB extends AbstractBuilder{
    public ConcreteBuilderB(){
        this.description = "B";
    }
    public ProductIF getProduct(){
        return new ConcreteProductB(this);
    }
}