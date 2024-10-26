package Thread.MulthreadMechanism;


/**
 * CompletableFuture helps run tasks asynchronously (in the background) without waiting for them to complete.
 * It's useful when you want to run tasks one after the other without blocking the main thread.
 */

import java.util.concurrent.CompletableFuture;

/**
 * For example, when you run a task using CompletableFuture, it will keep working in the background,
 * and your main program can continue doing other things without stopping to wait for the task to finish.
 * When the task is done, it will automatically move to the next step.
 */

public class CompletableFutures {

    public static void main(String[] args) throws InterruptedException {

        try {
            CompletableFuture.supplyAsync(()->"result")
                    .thenApply(result->result+"world")
                    .thenApply(
                            result->{
                                try {
                                    Thread.sleep(5000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                return result;

                            })
                    .thenAccept(System.out::println);
        }
        catch (Exception e){

        }

        System.out.println("piyush");

        Thread.sleep(2000);

        System.out.println("ranjan");

    }


}
