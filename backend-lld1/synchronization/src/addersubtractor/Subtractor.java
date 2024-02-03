package addersubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;
    Subtractor(Value value) {
        this.value = value;
    }
    @Override
    public Void call() {
        for(int i = 1; i <= 50000; i++) {
            this.value.value -= i;
        }
        return null;
    }
}
