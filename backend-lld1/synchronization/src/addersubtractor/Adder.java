package addersubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    private Value value;
    private Lock lock;
    Adder(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 50000; i++) {
            lock.lock();
            this.value.value += i;
            lock.unlock();

            // this line below also put lock on value object
            // value.incrementBy(i); because incrementBy is synchronized
        }

        // same functionality as above

//        for(int i = 1; i <= 50000; i++) {
//            synchronized (value) {
//                this.value.value += i;
//                System.out.println("Adder Number " + i);
//            }
//        }

        return null;

    }
}
