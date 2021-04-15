package ShapePool;

public class Square implements ShapeIF{

    private String type;
    private double size;
    public Square(double size){
        this.type = "Square";
        this.size = size;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
