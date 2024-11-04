package Thread.Locks.StampedLock;

/**
 * StampedLock is a type of lock in Java that offers more flexibility and efficiency than a traditional ReadWriteLock.
 * It provides three main types of locks for accessing a shared resource:
 *
 * Read Lock: Allows multiple threads to read the data at the same time.
 * Write Lock: Allows only one thread to write, blocking all other reads and writes.
 * Optimistic Read Lock: A lightweight, non-blocking read lock that lets a thread read the data without locking it fully.
 * If another thread tries to write, the optimistic read lock can be validated to ensure the data hasn't changed during the read.
 */

public class StampedMain {

    public static void main(String[] args) {

        SharedStampedResources sharedStampedResources=new SharedStampedResources();

        Thread t1=new Thread(()->{
            sharedStampedResources.produce();
        });
        Thread t2=new Thread(()->{
            sharedStampedResources.consume();
        });

        t1.start();



































    }
}
