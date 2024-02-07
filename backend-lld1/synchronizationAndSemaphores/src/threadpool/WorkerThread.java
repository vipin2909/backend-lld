package threadpool;

public class WorkerThread implements Runnable {

    private int workerNumber;

    WorkerThread(int workerNumber) {
        this.workerNumber = workerNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i+=20) {
            System.out.println("Worker Number: " + workerNumber + ", percent complete: " + i);
        }
        try {
            Thread.sleep((int)(Math.random() * 1000));
        }
        catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
