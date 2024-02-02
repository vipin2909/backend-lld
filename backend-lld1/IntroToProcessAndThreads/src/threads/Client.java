package threads;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        helloWorldPrinter.run();

        Thread t = new Thread(helloWorldPrinter);
        t.start();
//        Thread t1 = new Thread(helloWorldPrinter);
//        t1.start();
        System.out.println("Current Thread : " + Thread.currentThread().getName());

    }
}
