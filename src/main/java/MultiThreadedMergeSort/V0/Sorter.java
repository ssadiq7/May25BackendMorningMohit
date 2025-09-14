package MultiThreadedMergeSort.V0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToBeSorted;

    public Sorter(List<Integer> arrayToBeSorted) {
        this.arrayToBeSorted = arrayToBeSorted;
    }

    @Override
    public List<Integer> call() throws Exception { // Let's write the logic of MergeSort here

        System.out.println("Sorting is happening in : " + Thread.currentThread().getName());
        System.out.println("Array : " + arrayToBeSorted);

        int size = arrayToBeSorted.size();

        if(size <= 1) { // Base condition
            return arrayToBeSorted;
        }

        int mid =  size / 2;

        List<Integer> leftArray = arrayToBeSorted.subList(0, mid);
        List<Integer> rightArray = arrayToBeSorted.subList(mid, size);

        // we need to further break this into half for sorting
        // so we will create 2 new tasks for that
        Sorter leftArraySorterTask = new Sorter(leftArray);
        Sorter rightArraySorterTask = new Sorter(rightArray);

        // Now these tasks need to be passed to ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Runnable : execute method
        // Callable : submit method
//        executorService.submit(leftArraySorterTask); // call function returns something called future
//        executorService.submit(rightArraySorterTask); // using which we can wait for both threads to complete before merging
        /*
        * These Future have functions called get functions, they keep on waiting until we get the data out of it
         */
        Future<List<Integer>> leftArrayFuture = executorService.submit(leftArraySorterTask);
        Future<List<Integer>> rightArrayFuture = executorService.submit(rightArraySorterTask);

//        leftArrayFuture.get();
//        rightArrayFuture.get();
        /*
        * Both the above threads are working simultaneously right now
        * The above get functions will keep on waiting for the thread to be completed
        * Then only it will move on further
         */
        List<Integer> sortedLeftArray = leftArrayFuture.get();
        List<Integer> sortedRightArray = rightArrayFuture.get();
        // the get function will block the current thread until the data is ready and returned
        // if we are expecting exception would come then we can put try and catch on the above code




        // The above code will split the array half, half, half until only 1 element exists
        // After this, we need to merge the left and right array by comparing their value and placing them accordingly

        int i = 0, j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        // After this the array is sorted and merged together
        return sortedArray;

    }

}