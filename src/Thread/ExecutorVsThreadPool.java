package Thread;


import java.util.concurrent.*;

/**
 *
 * The Executor Framework in Java is a high-level API that simplifies the
 * execution of tasks asynchronously using a pool of threads.
 *
 * ExecutorService is an interface in Java’s java.util.concurrent package,
 * and ThreadPoolExecutor is one of its implementing classes.
 *
 * Difference:
 * ExecutorService (Interface)
 *
 * It provides higher-level thread pool management.
 * It abstracts thread pool creation and execution.
 * Common methods: submit(), execute(), shutdown(), etc.
 * Examples: Executors.newFixedThreadPool(5), Executors.newCachedThreadPool().
 * ThreadPoolExecutor (Concrete Class)
 *
 * It is a customizable implementation of ExecutorService.
 * Provides fine-grained control over thread pool behavior.
 * Requires parameters like core pool size, max pool size, queue, etc.
 */

public class ExecutorVsThreadPool {

    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(() -> System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName()));
        }
        executor.shutdown();

        ThreadPoolExecutor executor1 = new ThreadPoolExecutor(
                2, // Core pool size
                4, // Max pool size
                60, TimeUnit.SECONDS, // Keep alive time for extra threads
                new LinkedBlockingQueue<>(2) // Task queue with capacity 2
        );

        for (int i = 1; i <= 6; i++) {
            final int taskId = i;
            executor.execute(() -> System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName()));
        }

        executor.shutdown();
    }
}
