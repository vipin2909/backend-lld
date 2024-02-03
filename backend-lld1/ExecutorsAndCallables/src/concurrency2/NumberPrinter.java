package concurrency2;

public class NumberPrinter implements Runnable {
    int np;
    NumberPrinter(int np) {
        this.np = np;
    }

    @Override
    public void run() {
        System.out.println(np + " Thread & Name: " + Thread.currentThread().getName());
    }
}
