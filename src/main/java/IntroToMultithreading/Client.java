package IntroToMultithreading;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
    // Runnable
        System.out.println(Thread.currentThread().getName());
//        helloWorldPrinter.run();
        Thread t = new Thread(helloWorldPrinter);
        t.start(); // internally it calls obj.run()
        System.out.println("After creating the thread in " + Thread.currentThread().getName());
    }
}

// Thread
// start () {    run()           }
// Runnable interface : run()

// HW : Print 1 -> 100
// every number should be printed in a different thread
