public class ECounter{
    private int index;

    // This is the unique Object Allowed to be created
    private static ECounter counterObject = null;

    // Hidden constructor
    private ECounter(){
        index = 0;
    }

    // This guarantees that only one instance of the ECounter Object gets created
    public static ECounter getCounter(){
        if(counterObject == null){
            counterObject = new ECounter();
            System.out.println("\nNew Instance of Ecounter created\n");
        }
        return counterObject;
    }

    // Increment the counter
    public void incrementCounter(){
        index ++;
    }

    // The the counter count
    public int getIndexValue(){
        return index;
    }
}