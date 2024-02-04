package addersubtractor;

public class Value {
    public int value = 0;

    synchronized public void incrementBy(int offset) {
        value += offset;
    }

    public void subtractor(int offset) {
        value -= offset;
    }
}
