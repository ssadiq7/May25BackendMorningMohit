package IntroToMultithreading.Day142Concurrency2Q6ThreadsWithCallables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    private int n;

    public ArrayCreator(int n) {
        this.n = n;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        List<Integer> numbers = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}
