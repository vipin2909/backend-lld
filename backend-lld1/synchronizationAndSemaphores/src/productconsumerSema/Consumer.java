package productconsumerSema;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore prodSema, consSema;

    Consumer(Store store, Semaphore prodSema, Semaphore consSema) {
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true) {
            try {
                consSema.acquire();
            }
            catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSema.release();
        }
    }
}
