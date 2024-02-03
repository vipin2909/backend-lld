package treeSIzeCalculator;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    Node node;
    ExecutorService es;
    TreeSizeCalculator(Node node, ExecutorService es) {
        this.node = node;
        this.es = es;
    }
    @Override
    public Integer call() throws ExecutionException, InterruptedException {
        // base case when root node is null
        if(node == null) return 0;

        TreeSizeCalculator leftTree = new TreeSizeCalculator(node.left, es);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(node.right, es);

        Future<Integer> leftFutureSize = es.submit(leftTree);
        Future<Integer> rightFutureSize = es.submit(rightTree);

        int leftSize = leftFutureSize.get();
        int rightSize = rightFutureSize.get();

        return rightSize + leftSize + 1;
    }
}
