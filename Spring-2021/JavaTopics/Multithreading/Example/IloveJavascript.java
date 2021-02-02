package Example;

class IloveJavascript implements Runnable{

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++){
                System.out.println("I Love Javascript!");
                Thread.sleep(200);
            }
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
}