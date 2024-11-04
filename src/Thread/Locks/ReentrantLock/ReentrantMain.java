package Thread.Locks.ReentrantLock;

/**
 * ReentrantLock allows a thread to re-enter a lock it already owns, making it more flexible than a simple synchronized block.
 */

public class ReentrantMain {
    public static void main(String[] args) {
        SharedResources sharedResources=new SharedResources();

        Thread t1=new Thread(()->{

            sharedResources.producer();

        });

        Thread t2=new Thread(()->{
            sharedResources.producer();
        });

        t1.start();
        t2.start();
    }
}
