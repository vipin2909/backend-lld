package foobaralternate;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;
    private Semaphore fo, ba;

    FooBar(int n) {
        this.n = n;
        fo = new Semaphore(1);
        ba = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for(int i = 0; i < n; i++) {
            fo.acquire();
            printFoo.run();
            ba.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for(int i = 0; i < n; i++) {
            ba.acquire();
            printBar.run();
            fo.release();
        }
    }
}
