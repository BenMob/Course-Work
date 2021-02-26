package Template;

public abstract class AbstractBuilder{

    protected String description;

    public static AbstractBuilder getInstance(String description){
        AbstractBuilder builder = null;

        if(description.equals("A")){
            builder = new ConcreteBuilderA();
        }else if(description.equals("B")){
            builder = new ConcreteBuilderB();
        }

        System.out.println("Getting an instance of ConcreteBuilder" + description + " that extends AbstractBuilder.");
        return builder;
    }

    public String getDescription() {
        return description;
    }

    public AbstractBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public AbstractBuilder buildPart1(){
        System.out.println("Building Part 1 of ConcreteProduct" + this.getDescription());
        return this;
    }

    public AbstractBuilder buildPart2(){
        System.out.println("Building Part 2 of ConcreteProduct" + this.getDescription());
        return this;
    }

    public abstract ProductIF getProduct();
}