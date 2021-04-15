package ShapePool;

import java.util.*;

public class ShapePoolStack{
    private static ShapePoolStack instance = null;
    private int maximumPoolSize;
    private Stack<ShapeIF> shapeStack = new Stack<ShapeIF>();

    private ShapePoolStack(){
        this.maximumPoolSize = 5;

        // Temporary
        for(int i = 0; i < this.maximumPoolSize; i++){
            if (i%2 == 0){
                shapeStack.push(new Square(5));
            }else{
                shapeStack.push(new Circle(10));
            }
        }
    }

    public static ShapePoolStack getInstance(){
        if (instance == null){
            instance = new ShapePoolStack();
        }
        return instance;
    }

    public ShapeIF acquireShape(){
        if (shapeStack.size() == 0){
            System.out.println("There is no Shape available in the shape pool right now!");
            return null;
        }else{
            return shapeStack.pop();
        }
    }

    public boolean returnShape(ShapeIF shape){
        if(shapeStack.size() >= maximumPoolSize){
            System.out.println("The shape pool is full!");
            return false;
        }else{
            shapeStack.push(shape);
            return true;
        }
    }

    public ShapePoolStack setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
        return this;
    }
}