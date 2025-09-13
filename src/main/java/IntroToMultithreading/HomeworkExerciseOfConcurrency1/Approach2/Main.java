package IntroToMultithreading.HomeworkExerciseOfConcurrency1.Approach2;

public class Main {

    public static void main(String[] args) {
        Thread t;
        for(int i = 1; i <= 100; i++) {
            t = new Thread(new Printer(i));
            t.start();
        }
    }

}