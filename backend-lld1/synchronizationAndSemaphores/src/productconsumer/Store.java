package productconsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove(items.size() - 1);
    }
}