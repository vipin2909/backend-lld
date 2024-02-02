package threads;

public class HelloWorldPrinter implements Runnable {

    public void doSomething() {
        System.out.println("Inside Do Something " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Hello World from: " + Thread.currentThread().getName());
        doSomething();
    }
}
