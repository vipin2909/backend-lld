package addersubtractor;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder adder = new Adder(v);
        Subtractor subtractor = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();


        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractFuture = es.submit(subtractor);

        adderFuture.get();
        subtractFuture.get();

        System.out.println(v.value);
    }
}
