package ShapePool;

public class Circle implements ShapeIF{

    private String type;
    private double radius;
    public Circle(double redius){
        this.type = "Circle";
        this.radius = radius;
    }

    @Override
    public String getType() {
        return this.type;
    }
}