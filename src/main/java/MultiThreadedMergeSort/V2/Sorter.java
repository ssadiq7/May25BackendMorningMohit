package MultiThreadedMergeSort.V2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToBeSorted;
    private ExecutorService executor;

    public Sorter(List<Integer> arrayToBeSorted,  ExecutorService executor) {
        this.arrayToBeSorted = arrayToBeSorted;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception { // Let's write the logic of MergeSort here
        System.out.println("Thread of each call : " + Thread.currentThread().getName());

        int size = arrayToBeSorted.size();

        if(size <= 1) { // Base condition
            return arrayToBeSorted;
        }

        int mid =  size / 2;

        List<Integer> leftArray = arrayToBeSorted.subList(0, mid);
        System.out.println("Left Array : " + leftArray);
        List<Integer> rightArray = arrayToBeSorted.subList(mid, size);
        System.out.println("Right Array : " + rightArray);

        Sorter leftArraySorterTask = new Sorter(leftArray, executor);
        Sorter rightArraySorterTask = new Sorter(rightArray, executor);

        Future<List<Integer>> leftArrayFuture = executor.submit(leftArraySorterTask);
        Future<List<Integer>> rightArrayFuture = executor.submit(rightArraySorterTask);

        List<Integer> sortedLeftArray = leftArrayFuture.get();
        List<Integer> sortedRightArray = rightArrayFuture.get();

        // The above code will split the array half, half, half until only 1 element exists
        // After this, we need to merge the left and right array by comparing their value and placing them accordingly

        int i = 0;
        int j = 0;

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

        System.out.println("Sorted array : " + sortedArray);
        // After this the array is sorted and merged together
        return sortedArray;
    }

}