package IntroToMultithreading.Day142Concurrency2Q7ThreadsWithCallables2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create the root node
        Node root = new Node(10);

        // Create the left and right child nodes
        Node leftChild = new Node(5);
        Node rightChild = new Node(15);

        // Link the child nodes to the root
        root.left = leftChild;
        root.right = rightChild;

        // At this point, you have a simple tree structure:
        //       10
        //      /  \
        //     5    15

        // You can now use the 'root' node to test your tree logic.
        // For example, you can print the data of each node to verify:
        System.out.println("Root node data: " + root.data);
        System.out.println("Left child data: " + root.left.data);
        System.out.println("Right child data: " + root.right.data);


        // Creating more nodes on the left child nodes
        Node leftChildLeft = new Node(4);
        Node leftChildRight = new Node(6);

        // Link the child nodes to the root
        leftChild.left = leftChildLeft;
        leftChild.right = leftChildRight;

        /****************************************************/

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> futureAns = executor.submit(new TreeSizeCalculator(root, executor));
        Integer ans = futureAns.get();
        executor.shutdown();

        System.out.println("Ans is: " + ans);
    }
}
