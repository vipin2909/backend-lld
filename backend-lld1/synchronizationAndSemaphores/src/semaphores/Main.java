package semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Store store = new Store(5);

        Semaphore test = new Semaphore(1);
        Semaphore test1 = new Semaphore(0);
        for(int i = 1; i <= 2; i++) {
            es.submit(new Test(store, test, test1));
        }
        for(int i = 1; i <= 3; i++) {
            es.submit(new Test1(store, test, test1));
        }
    }
}


//https://medium.com/@basecs101/deadlock-wait-notify-and-notifyall-in-java-multi-threading-latest-69f5e65375b3#:~:text=notifyAll()%3A,the%20lock%20on%20this%20object.