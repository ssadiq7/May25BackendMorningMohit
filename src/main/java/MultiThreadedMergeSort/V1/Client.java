package MultiThreadedMergeSort.V1;

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

        ExecutorService executor = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arrayToSort, executor);
        Future<List<Integer>> sortedArrayFuture = executor.submit(sorter);
        List<Integer> sortedArray = sortedArrayFuture.get();
        executor.shutdown();

        System.out.println(sortedArray);
    }
}
/*
* Note: if we had created only fixed thread pool (with 3 threads let's assume)
* we would have created a mess, why? because, the code will block in between
* because 1 thread will call the main array, the other 2 threads will call the left and right array
* and then, because we have mentioned Future.get(), the threads will wait for its recursive function calls to complete
* but because there are no more threads available to assign to internal recursive function calls,
* the threads will wait indefinitely, therefore creating a deadlock situation
* In summary, in this kind of recursive function call program we ideally do not know how many function calls
* would happen internally, because it depends on the input array size and therefore cached thread pool came in handy.
 */