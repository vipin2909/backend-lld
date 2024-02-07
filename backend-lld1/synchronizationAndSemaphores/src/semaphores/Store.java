package semaphores;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }
    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        items.add(new Object());
    }

    public void removeItem() {
        items.remove();
    }
}
