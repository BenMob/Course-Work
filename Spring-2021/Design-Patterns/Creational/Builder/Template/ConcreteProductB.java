package Template;


public class ConcreteProductB implements ProductIF{
    private String description;
    public ConcreteProductB(ConcreteBuilderB b){
        this.description = b.getDescription();
        System.out.println("ConcreteProduct" + this.description + " has been fully built.");
    }

    @Override
    public void option1(){
        System.out.println("Option1 in ConcreteProduct" + this.description);
    }

    @Override
    public void option2(){
        System.out.println("Option2 in ConcreteProduct" + this.description);
    }
}