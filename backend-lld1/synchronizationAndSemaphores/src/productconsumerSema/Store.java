package productconsumerSema;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    ConcurrentLinkedDeque<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + items.size());
        items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Consumer consuming item, current size " + items.size());
        items.remove();
    }
}
