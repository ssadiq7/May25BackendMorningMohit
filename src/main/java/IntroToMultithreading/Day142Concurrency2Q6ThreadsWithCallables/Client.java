package IntroToMultithreading.Day142Concurrency2Q6ThreadsWithCallables;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<List<Integer>> ansFuture = executor.submit(new ArrayCreator(number));
        List<Integer> ans = ansFuture.get();
        executor.shutdown();

        System.out.println("The numbers are : " + ans);
    }
}
