package ShapePool;

public class Client{

   public static void main(String[] args){

       System.out.println();
       System.out.println("Creating a Shape pool");
       ShapePoolStack pool = ShapePoolStack.getInstance();

       System.out.println("Getting Shapes from the pool:");
       ShapeIF shape1 = pool.acquireShape();
       System.out.println(shape1.getType());

       ShapeIF shape2 = pool.acquireShape();
       System.out.println(shape2.getType());

       ShapeIF shape3 = pool.acquireShape();
       System.out.println(shape3.getType());

       ShapeIF shape4 = pool.acquireShape();
       System.out.println(shape4.getType());

       ShapeIF shape5 = pool.acquireShape();
       System.out.println(shape5.getType());

       ShapeIF shape6 = pool.acquireShape();  // This won't be added as the pool is full

       System.out.println();
       System.out.println("Returning the resuable shapes in the pool:");
       System.out.println(pool.returnShape(shape1));
       System.out.println(pool.returnShape(shape2));
       System.out.println(pool.returnShape(shape3));
       System.out.println(pool.returnShape(shape4));
       System.out.println(pool.returnShape(shape5));
       System.out.println(pool.returnShape(shape6));
   }
}