package IntroToMultithreading.HomeworkExerciseOfConcurrency1.EfficientApproach;

public class Printer implements Runnable {

    int noToPrint;

    public Printer(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    public void print() {
        System.out.println("Printing number: " + noToPrint + " in Thread : " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }

}