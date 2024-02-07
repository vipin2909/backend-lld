package semaphores;

import java.util.concurrent.Semaphore;

public class Test1 implements Runnable {

    private Store store;
    private Semaphore test, test1;

    Test1(Store store, Semaphore test, Semaphore test1) {
        this.store = store;
        this.test = test;
        this.test1 = test1;
    }

    @Override
    public void run() {

    }

}
