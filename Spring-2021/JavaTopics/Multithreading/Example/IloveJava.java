package Example;

class IloveJava implements Runnable{

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++){
                System.out.println("\t\t\t\t\t\t\t\t\t\tI Love Java!");
                Thread.sleep(200);
            }
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
}