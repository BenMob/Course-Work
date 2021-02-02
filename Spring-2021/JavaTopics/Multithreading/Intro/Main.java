package Intro;


class Main{

    public static void main(String[] args) throws InterruptedException{

        // Main Thread
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread: " + mainThread.getName());

        // Secondary thread using Thread class Method 1
        MyThread myThread = new MyThread();
        myThread.start();  // Runs the run() method of MyThread class

        // Secondary thread using Runnable method 2
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start(); // Runs the run() method in MyRunnable

        // Secondary thread using anonymous function method 3
        Runnable runnableAnonymous = new Runnable(){
            public void run(){
                System.out.println("Running runnable thread with anonymous function!");
            }
        };

        // Secondary thread using lambda notation
        Runnable runnableLambda = () -> {System.out.println("Lambda Runnable running");};

    }

}