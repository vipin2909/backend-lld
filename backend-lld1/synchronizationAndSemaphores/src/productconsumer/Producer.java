package productconsumer;

public class Producer implements Runnable {

    private Store store;

    Producer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                // Solves sync issues but allows only 1 thread to execute its critical section at a time
                // efficiency can be improved by allowing more threads to execute their critical section at
                // a time
                if(store.getItems().size() < store.getMaxSize()) {
                    store.addItem();
                }
            }
        }
    }
}