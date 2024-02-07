package philospher;

public class Main {
    public static void main(String[] args) {
        Eat eat = new Eat();
        PickLeftFork pickLeftFork = new PickLeftFork();
        PickRightFork pickRightFork = new PickRightFork();
        PutLeftFork putLeftFork = new PutLeftFork();
        PutRightFork putRightFork = new PutRightFork();

        DiningPhilospher diningPhilospher = new DiningPhilospher();
        try{
            for(int i = 0; i <= 4; i++)
            diningPhilospher.wantToEat(i, pickLeftFork, pickRightFork, eat, putLeftFork, putRightFork);
        }
        catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
