package MarkerInterface;

public class Test{

    public static void main(String[] arg){
        Pen p = new Pen();
        Object o = new Object();

        if(p instanceof Writer){
            p.write();
        }else{
            System.out.println("p is not allowed to call write()");
        }


        if(o instanceof Writer){
            System.out.println("o can call write!");
        }else{
            System.out.println("o is not allowed to call write()");
        }


    }
}