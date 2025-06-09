package IntroToMultithreading;

public class NumberPrinter implements Runnable{
    private int noToPrint;

    public NumberPrinter(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    void print(){
        System.out.println("Printing number: " + noToPrint + " in Thread : " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        // Needs to print a particular number
        // From where we will get the number ?
        print();
    }
}
