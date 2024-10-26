package Thread.MulthreadMechanism;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

/**
 * When you need to perform a task that will return a result at some point,
 * but you don’t need it immediately. You can get the result later.
 */

public class Future {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("start");

        ExecutorService executorService= Executors.newFixedThreadPool(1);

        java.util.concurrent.Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(8000);
            return 42; // Some calculation
        });
        System.out.println("Result: " + future.get()); // blocks until the result is ready
        executorService.shutdown();
        System.out.println("end");


    }
}
