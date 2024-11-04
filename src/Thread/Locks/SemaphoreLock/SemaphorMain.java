package Thread.Locks.SemaphoreLock;

/**
 * A Semaphore in Java is a tool used to control the number of threads that can access a shared resource at the same time.
 * It allows you to set a limit on how many threads can perform a certain operation concurrentl
 */

public class SemaphorMain {
    public static void main(String[] args) {
        SharedSemophor sharedSemophor=new SharedSemophor();

        Thread t1=new Thread(()->{
            sharedSemophor.producer();
        });
        Thread t2=new Thread(()->{
            sharedSemophor.producer();
        });
        Thread t3=new Thread(()->{
            sharedSemophor.producer();
        });
        Thread t4=new Thread(()->{
            sharedSemophor.producer();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
