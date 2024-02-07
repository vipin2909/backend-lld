package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        int numberWorkers = 4;
        int threadPoolSize = 2;

        ExecutorService es = Executors.newFixedThreadPool(threadPoolSize);

        WorkerThread[] workers = new WorkerThread[numberWorkers];
        for(int i = 0; i < numberWorkers; i++) {
            workers[i] = new WorkerThread(i);
            es.execute(workers[i]);
        }
//        es.shutdown();
    }
}
