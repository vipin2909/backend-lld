package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arr;
    ExecutorService es;
    Sorter(List<Integer> arr, ExecutorService es) {
        this.arr = arr;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {
        System.out.println("Thread: " + Thread.currentThread().getName());
        System.out.println(arr);
        System.out.println("\n\n");
        if(arr.size() <= 1) return arr;
        int size = arr.size();
        int mid = arr.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i = 0; i < mid; i++) leftArray.add(arr.get(i));
        for(int i = mid; i < size; i++) rightArray.add(arr.get(i));

        Sorter leftArraySorter = new Sorter(leftArray, es);
        Sorter rightArraySorter = new Sorter(rightArray, es);

        // Pass these objects in the thread pool
//        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> leftSortedArrayFuture = es.submit(leftArraySorter);
        Future<List<Integer>> rightSortedArrayFuture = es.submit(rightArraySorter);


        // Java waits till completion (Important Step)
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        List<Integer> sortedArray = new ArrayList<>();

        int i = 0, j = 0;
        while(i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if(leftSortedArray.get(i) <= rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i+=1;
            }
            else {
                sortedArray.add(rightSortedArray.get(j));
                j+=1;
            }
        }

        while(i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i+=1;
        }

        while(j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j+=1;
        }
        return sortedArray;
    }



}
