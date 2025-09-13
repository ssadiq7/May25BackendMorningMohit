package IntroToMultithreading.HomeworkExerciseOfConcurrency1.Approach1;

public class Print extends Thread{

    private int n;

    public Print(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(n + " from thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        for(int i = 1; i <= 100; i++) {
            Print p = new Print(i);
            p.start();
            p.join(); // Ensure the main thread waits for the current thread to finish before starting the next
            // If not this, the output may not be in order
        }

    }

}