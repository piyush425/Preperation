package Thread.Locks.LockFree;

public class AtomicMain {

    public static void main(String[] args) throws InterruptedException {

        SharedAtomic sharedAtomic = new SharedAtomic();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedAtomic.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedAtomic.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (may vary due to race condition): " + sharedAtomic.get());
    }


}
