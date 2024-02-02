package adderSubtractor;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am main class");

        Adder adder = new Adder();
        Thread thread1 = new Thread(adder);
        thread1.start();

        Subtractor subtractor = new Subtractor();
        Thread thread2 = new Thread(subtractor);
        thread2.start();

    }
}
