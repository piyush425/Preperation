package Thread.ThreadPool;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class  CustomeRejectHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

        System.out.println("Task Denied: "+r.toString());

    }
}

//Type of RejectedExecutionHandler

/**
 * AbortPolicy (default policy):
 *
 * Description: Throws a RejectedExecutionException when a task is rejected.
 * Use Case: When you want to be notified immediately if the pool or queue is full, making it suitable for applications that cannot afford to lose tasks.
 * Code: new ThreadPoolExecutor.AbortPolicy()
 */

/**
 * DiscardPolicy:
 *
 * Description: Silently discards the rejected task without any notification.
 * Use Case: When occasional task loss is acceptable, and you don’t want to handle rejected tasks explicitly. Good for systems where load spikes can be handled by simply ignoring some tasks.
 *
 * Code: new ThreadPoolExecutor.DiscardPolicy()
 */

/**
 * DiscardOldestPolicy:
 *
 * Description: Discards the oldest unprocessed task in the queue to make room for the new task.
 * Use Case: When the latest tasks are more important than the oldest ones. It prioritizes recent requests over ones that have been waiting the longest.
 * Code: new ThreadPoolExecutor.DiscardOldestPolicy()
 *
 */
/**
 * CallerRunsPolicy:
 *
 * Description: The task is run by the thread that submitted it, slowing down the rate at which new tasks are submitted by pushing some of the work back to the caller.
 * Use Case: To provide a backpressure mechanism, as this policy allows the caller to slow down when the queue is full, helping to manage load.
 * Code: new ThreadPoolExecutor.CallerRunsPolicy()
 */
