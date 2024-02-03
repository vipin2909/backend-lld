package arrayCreator;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ExecutorService es = Executors.newCachedThreadPool();
        Creator creator = new Creator(n);
        Future<List<Integer>> listFuture = es.submit(creator);
        List<Integer> res = listFuture.get();
        System.out.println(res);
    }
}
