package MultiThreadedMergeSort.V0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> arrayToSort = List.of(
                8, 1, 2, 9, 6, 3, 7, 5
        );

        // Call the Sorter
        Sorter sorter = new Sorter(arrayToSort); // Creating an object of the Sorter class with the array to be sorted

        // Create a new thread and pass the task of sorting
        ExecutorService executor = Executors.newCachedThreadPool();
//        executor.submit(sorter); // This will return me a Future, and we need to wait for the task to complete
        Future<List<Integer>> sortedArrayFuture = executor.submit(sorter);
//        sortedArrayFuture.get(); // to get the final result and print it.
        List<Integer> sortedArray = sortedArrayFuture.get();

        // Let us print the sorted array
        System.out.println(sortedArray);

    }
}

/*
* When we execute this function, we will know that we are creating many thread pools
* Ideally, we should have only 1 pool, we should not have a new pool for every sorting task
* This 1 pool should be passed on everywhere
* For this, refer to V1
 */