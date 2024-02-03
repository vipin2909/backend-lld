package mergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = Arrays.asList(8, 1, 9, 2, 6, 3, 7, 5);
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter arraySorter = new Sorter(arr, es);
        Future<List<Integer>> sortedArrayFuture = es.submit(arraySorter);
        List<Integer> sortedArray = sortedArrayFuture.get();
        System.out.println(sortedArray);
    }
}
