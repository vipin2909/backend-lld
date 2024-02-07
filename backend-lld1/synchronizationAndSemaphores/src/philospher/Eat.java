package philospher;

public class Eat implements Runnable {
    @Override
    public void run() {
        System.out.println("Philosopher Eating");
    }
}
