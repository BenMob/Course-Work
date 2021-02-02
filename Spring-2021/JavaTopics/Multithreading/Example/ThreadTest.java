package Example;

class ThreadTest{
    private static void createThreadOne(){
        Runnable runnable = new IloveJava();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static void createThreadTwo(){
        Runnable runnable = new IloveJavascript();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static void createThreadThree(){
        Runnable runnable = new IloveCoding();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static void runAllThreads(){
        createThreadOne();
        createThreadTwo();
        createThreadThree();
    }

    public static void main(String[] args){
        runAllThreads();
    }
}