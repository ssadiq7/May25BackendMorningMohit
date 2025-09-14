package IntroToMultithreading.Day142Concurrency2Q7ThreadsWithCallables2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// To calculate the size of a Binary Tree using multiple Threads
public class TreeSizeCalculator implements Callable<Integer> {
    private final Node root;
    private ExecutorService executor;

    public TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {
        // Calculate the size of a BinaryTree using multiple threads.
        if(root == null) return 0;

        Node left = root.left;
        Node right = root.right;

        TreeSizeCalculator leftSideCalc = new TreeSizeCalculator(left, executor);
        TreeSizeCalculator rightSideCalc = new TreeSizeCalculator(right, executor);

        Future<Integer> leftAns = executor.submit(leftSideCalc);
        Future<Integer> rightAns = executor.submit(rightSideCalc);

        int leftSize = leftAns.get();
        int rightSize = rightAns.get();

        return 1 + leftSize + rightSize;
    }
}
