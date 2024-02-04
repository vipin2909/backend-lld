package addersubtractor;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(v, lock);
        Subtractor subtractor = new Subtractor(v, lock);

        ExecutorService es = Executors.newCachedThreadPool();


        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractFuture = es.submit(subtractor);

        adderFuture.get();
        subtractFuture.get();

        System.out.println(v.value);
    }
}
