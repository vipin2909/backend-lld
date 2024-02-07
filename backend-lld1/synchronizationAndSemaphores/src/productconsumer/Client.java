package productconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Store store = new Store(5);
        
        for(int i = 1; i <= 8; i+=1) {
            es.execute(new Producer(store));
        }
        
        for(int i = 1; i <= 20; i+=1) {
            es.execute(new Consumer(store));
        }
    }
}