package Thread.Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * A ReentrantLock is a lock provided in the java.util.concurrent.locks package
 * that allows a thread to acquire the same lock multiple times without causing a deadlock.
 */

public class ReentrantExample {
    ReentrantLock lock = new ReentrantLock();

    public void method1() {
        lock.lock();  // 1st lock
        try {
            System.out.println("method1(): Lock acquired, calling method2()");
            method2();  // re-acquires lock
        } finally {
            lock.unlock(); // 1st unlock
        }
    }

    public void method2() {
        lock.lock();  // 2nd lock by same thread
        try {
            System.out.println("method2(): Lock acquired again");
        } finally {
            lock.unlock(); // 2nd unlock
        }
    }

    public static void main(String[] args) {
        ReentrantExample obj = new ReentrantExample();
        Thread t1 = new Thread(obj::method1);
        t1.start();
    }
}

//method1(): Lock acquired, calling method2()
//method2(): Lock acquired again
//ReentrantLock allows the same thread to acquire the lock multiple times.
//
//The lock maintains a hold count internally (2 in this case).
//
//The thread must call unlock() once for each lock().
