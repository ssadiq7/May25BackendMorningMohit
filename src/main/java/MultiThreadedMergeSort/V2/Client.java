package MultiThreadedMergeSort.V2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        List<Integer> arrayToSort = List.of(
//                8, 1, 2, 9, 6, 3, 7, 5
//        );

        List<Integer> arrayToSort = List.of(
                8,1,2,9,6,3,7,5,4,5,4,6,4,5,5,43,5,7,6,5,4,79,6,5,4,6,1,5,74,85,5,6,8,6
        );

        System.out.println("Given Array : " + arrayToSort);

        ExecutorService executor = Executors.newCachedThreadPool(); // some threads were indeed reused
        Sorter sorter = new Sorter(arrayToSort, executor);
        Future<List<Integer>> sortedArrayFuture = executor.submit(sorter);
        List<Integer> sortedArray = sortedArrayFuture.get();
        executor.shutdown();

        System.out.println(sortedArray);
    }
}