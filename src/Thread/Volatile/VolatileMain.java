package Thread.Volatile;

/**
 * The volatile keyword in Java ensures that a variable's value is always read from and written to the main memory,
 * rather than from the thread's local cache.
 * This guarantees that changes made to a volatile variable by one thread are immediately visible to other threads.
 *
 * Without volatile, a thread might read a stale value from its local cache instead of the most recent value from main memory.
 */
public class VolatileMain {

    private static volatile  boolean flag=false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                flag = true; // Thread 1 sets flag to true
                System.out.println("Thread 1 toggled flag to: " + flag);
                try {
                    Thread.sleep(100); // Sleep to simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                flag = false; // Thread 2 sets flag to false
                System.out.println("Thread 2 toggled flag to: " + flag);
                try {
                    Thread.sleep(150); // Sleep to simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                // Print current flag value
                System.out.println("Current flag value in Thread 2: " + flag);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    /**
     * Output without volatile:
     *
     * When you run the example without volatile, you might observe that the output seems synchronized or orderly at times.
     * However, it’s essential to note that this does not guarantee consistent behavior. In some cases,
     * Thread 2 might read a stale value from its cache after Thread 1 updates the flag, leading to outputs that do not reflect the most recent updates.
     *
     *
     * Output with volatile:
     * When you include volatile, you might see outputs that seem out of order or not immediately reflecting the latest changes.
     * This is because volatile enforces visibility, meaning that Thread 2 will always read the most recent value from the main memory.
     * However, due to the asynchronous nature of thread execution, the timing might lead to situations where Thread 1 updates the flag, and before Thread 2 reads the updated value, it gets the current state of the flag.
     */
}
