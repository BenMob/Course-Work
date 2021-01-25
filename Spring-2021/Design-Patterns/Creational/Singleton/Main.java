public class Main{
    public static void main(String[] args){
        // Ecounter counter1 = new ECounter();  // This will not work because the constructor is private

        // However this will work
        ECounter counter1 = ECounter.getCounter();
        ECounter counter2 = ECounter.getCounter();

        // Are these two objects or is this juts one? Well let's see.
        System.out.println("Counter1 Hashcode: " + counter1.hashCode());
        System.out.println("Counter2 Hashcode: " + counter2.hashCode() + "\n");
    }
}