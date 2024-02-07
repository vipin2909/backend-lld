package productconsumerSema;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;
    private Semaphore prodSema, consuSema;

    Producer(Store store, Semaphore prodSema, Semaphore consSema) {
        this.store = store;
        this.consuSema = consSema;
        this.prodSema = prodSema;
    }

    @Override
    public void run() {
        while(true) {
            try {
                prodSema.acquire();
            }
            catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consuSema.release();
        }
    }
}
