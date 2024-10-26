package Thread;

public class Multithreading {
    /**
     * Multithreading is a programming technique that allows multiple threads (smaller units of a process) to run concurrently within a single program.
     * improving performance by using system resources efficiently
     * Each thread operates independently but shares the same memory space, allowing for faster execution and better responsiveness in applications
     *
     * In multithreading, shared resources are things like variables, objects, files, or databases that multiple threads can access at the same time.
     */

    /**
     *  //modern concurrency mechanisms
     *
     *  Future (from Java 5)
     *  CompletableFuture (from Java 8)
     *  ExecutorService (Thread Pool)
     *  Parallel Streams (from Java 8)
     *  Fork/Join Framework (from Java 7)
     *  Virtual Threads (Project Loom, Java 21+)
     */

    /**
     * Life Cycle Of Thread
     *
     * Thread in Java goes through several stages in its lifecycle.
     * These stages represent the different states a thread can be in, from its creation to its termination
     *
     * 1. New (Thread Created) -->The thread is in the NEW state.
     * State--> The thread has been created, but it hasn’t started running yet.
     * What happens-->You create a new thread object using new Thread() or a class that extends Thread or implements Runnable.
     *
     * Thread t = new Thread();
     *
     * 2. Runnable (Thread Ready to Run)-->The thread is in the RUNNABLE state.
     *
     * State: The thread is ready to run, but it may not yet be executing. The thread scheduler will determine when the thread gets CPU time.
     * What happens: When you call start() on the thread, it transitions from the New state to Runnable. It is ready to run, but it may not run immediately.
     *
     * t.start();
     *
     * 3. Running (Thread Currently Executing)
     *
     * When you create a thread and call start(), the thread enters the Runnable state.
     * It remains Runnable until the JVM and OS thread scheduler allocate CPU time to it, at which point the thread is in the Running state.
     * As soon as the thread gets time on the CPU and starts executing its run() method, it's considered Running.
     *
     * public void run() {
     *     System.out.println("Thread is running");
     * }
     *
     * 4. Blocked (Thread Waiting to Acquire a Lock)-->The thread is in the BLOCKED sta
     *
     * If one thread is holding a lock on a synchronized block or method, and another thread tries to enter it, the second thread will be blocked until the lock is released.
     * synchronized (someObject) {
     *     // Critical section
     * }
     *
     * 5. Waiting (Thread Waiting Indefinitely for Another Thread)--> thread is in the WAITING state.
     *
     * State: The thread is waiting indefinitely for another thread to perform a particular action (e.g., notifying it).
     * What happens: The thread is put in a waiting state by calling methods like Object.wait(), Thread.join(), or LockSupport.park().
     *
     * synchronized (obj) {
     *     obj.wait(); // Waiting for some other thread to notify it
     * }
     *
     *6. Timed Waiting (Thread Waiting for a Specified Time)-->The thread is in the TIMED_WAITING state.
     * State: The thread is waiting, but it has a time limit.
     *
     * Thread.sleep(1000); // Sleeping for 1 second
     *
     *
     * 7. Terminated (Thread Finished Execution)
     * State: The thread has finished executing (either by completing the task or by being stopped due to an exception).
     *
     * After a thread has completed its execution, it reaches this state and is no longer active.
     */











}
