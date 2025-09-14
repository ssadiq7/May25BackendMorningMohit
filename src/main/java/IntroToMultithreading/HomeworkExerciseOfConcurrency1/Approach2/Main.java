package IntroToMultithreading.HomeworkExerciseOfConcurrency1.Approach2;

public class Main {

    public static void main(String[] args) {
        Thread t;
        for(int i = 1; i <= 100; i++) {
            t = new Thread(new Printer(i)); // here we are crating 100 new threads, instead check the EfficientApproach
            // method, wherein the Printer task is assigned again and again to a pool of 10 threads only
            t.start();
        }
    }

}