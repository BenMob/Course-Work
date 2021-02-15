package ObjectCloning;

public class Test{
    private static void testShallowCloning(){
        Person p1 = new Person("Benjamin", "Ombeni", 20);
        Person p2 = new Person();
        System.out.println("Before Shallow Copy:");
        System.out.println("p1: " + p1.getFirstName() + "\t" + p1.getLastName());
        System.out.println("p2: " + p2.getFirstName() + "\t" + p2.getLastName());

        System.out.println("===========================================");
        p2 = p1;
        System.out.println("After Shallow Copy: => p2 = p1 ");
        System.out.println("p1: " + p1.getFirstName() + "\t" + p1.getLastName());
        System.out.println("p2: " + p2.getFirstName() + "\t" + p2.getLastName());

        System.out.println("===========================================");
        p2.setLastName("Mobole");
        System.out.println("After p2.setLastName(Mobole):");
        System.out.println("p1: " + p1.getFirstName() + "\t" + p1.getLastName());
        System.out.println("p2: " + p2.getFirstName() + "\t" + p2.getLastName());
        System.out.println();
        System.out.println("THAT WAS SHALLOW CLONING FOR YOU :)");
        System.out.println();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
       // testShallowCloning();
        Person p1 = new Person("Benjamin", "Ombeni", 20);

        Person p2 = (Person)p1.clone();
        System.out.println(p2.getFirstName());
        System.out.println(p2.getAge());


    }
}