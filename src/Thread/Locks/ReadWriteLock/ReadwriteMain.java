package Thread.Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * A ReadWriteLock is a special type of lock in Java that allows multiple threads to read a resource at the same time,
 * but only one thread to write to it at a time. This helps improve efficiency in scenarios where read operations are frequent and don't require exclusive access.
 */

public class ReadwriteMain {

    public static void main(String[] args) {

        SharedReadWrite sharedReadWrite=new SharedReadWrite();
        ReadWriteLock readWriteLock=new ReentrantReadWriteLock();

        Thread t1=new Thread(()->{
            sharedReadWrite.produce(readWriteLock);
        });

        Thread t2=new Thread(()->{
            sharedReadWrite.produce(readWriteLock);
        });

//        SharedReadWrite sharedReadWrite1=new SharedReadWrite();
//        Thread t3=new Thread(()->{
//            sharedReadWrite1.consume(readWriteLock);
//        });

        t1.start();
        t2.start();
//        t3.start();

    }
}
