package IntroToMultithreading.HomeworkExerciseOfConcurrency1.EfficientApproach;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10); // Using a pool of only 10 threads
        // using the same threads for 100 tasks instead of creating 100 threads for 100 tasks

        for(int i = 1; i <= 100000; i++) {
            if(i == 80000) {
                System.out.println("Reached 8000"); // put a debug point here to debug and see the threads in action
                // workQueue will be filled with tasks
                // workers will be busy executing tasks
                // there will be only 10 threads / workers in the pool
            }
            executorService.execute(new Printer(i));
        }
        executorService.shutdown(); // This is required to terminate the executor service or else the program will be continuously running.
    }
}