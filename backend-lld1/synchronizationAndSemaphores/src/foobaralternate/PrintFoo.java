package foobaralternate;

public class PrintFoo implements Runnable {
    @Override
    public void run() {
        System.out.println("Foo");
    }
}
