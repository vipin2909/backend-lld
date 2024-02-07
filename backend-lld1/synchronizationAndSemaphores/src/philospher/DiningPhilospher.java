package philospher;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilospher {

    ReentrantLock[] forks = new ReentrantLock[5];
    Semaphore taken = new Semaphore(4); // Avoid deadlock
    DiningPhilospher() {
        for(int i = 0; i < forks.length; i++) forks[i] = new ReentrantLock();
    }

    public void wantToEat(int philosopher, Runnable pickLeftFork, Runnable pickRightFork, Runnable eat,
                          Runnable putLeftFork, Runnable putRightFork) throws InterruptedException {
        int left = philosopher;
        int right = (philosopher+4)%5;

//        taken.acquire();

        System.out.println("Philosopher No. " + philosopher);

        forks[left].lock();
        pickLeftFork.run();

        forks[right].lock();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        forks[left].unlock();

        putRightFork.run();
        forks[right].unlock();

//        taken.release();

        System.out.println("\n\n\n");
    }
}
