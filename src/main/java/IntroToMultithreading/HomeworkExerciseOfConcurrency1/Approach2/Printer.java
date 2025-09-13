package IntroToMultithreading.HomeworkExerciseOfConcurrency1.Approach2;

public class Printer implements Runnable {

    private int n;

    public Printer(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(n);
    }

}