package Template;

public class Client{

    public static void main(String[] args){

        // Director variable.
        Director director = new Director();

        // Building ProductA.
        AbstractBuilder productABuilder = AbstractBuilder.getInstance("A");

        // If you call productBuilder.getProduct() here, you will be getting an empty product.
        // You need to build the product using the director as follows.
        ProductIF productA = director.build(productABuilder);

        // Building
        AbstractBuilder productBBuilder = AbstractBuilder.getInstance("B");
        ProductIF productB = director.build(productBBuilder);
    }
}