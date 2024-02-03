package concurrency2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es1 = Executors.newCachedThreadPool();

        for(int i = 1; i <= 100; i++) {
            if(i == 80) {
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
            es1.execute(numberPrinter);
        }

    }
}
