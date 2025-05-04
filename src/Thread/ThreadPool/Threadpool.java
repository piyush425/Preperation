package Thread.ThreadPool;

/**
 * What

 * A thread pool is a collection of pre-initialized threads that are maintained to perform tasks.
 * Instead of creating and destroying threads for every task, a thread pool allows for reusing existing threads,
 * which improves the efficiency and performance of multi-threaded applications.
 */

/**
 * Why
 *
 * Threads are reused for multiple tasks, saving time on creating and destroying them.
 * Less time spent on creating new threads leads to faster task execution.
 *
 * With a limited number of threads, context switching (the process of saving and restoring the state of threads) is minimized,
 * leading to better CPU usage and less performance degradation.
 */

/**
 * process
 *
 * Pool Setup:
 * Before starting, we configure the thread pool with a core (minimum) number of threads and a maximum limit.
 * We also set a task queue that holds tasks waiting for a thread to become available.
 *
 * Task Execution:
 * When a task is submitted, the pool checks if any threads in the pool are idle.
 * If an idle thread is found, it takes the task and starts executing it immediately.
 *
 * All Threads Busy:
 * If all core threads are busy and more tasks are submitted, these tasks are placed in the queue to wait until a thread becomes available.
 *
 * Queue Full Scenario:
 * If all threads are busy and the queue is full:
 * The pool will check if it can create additional threads up to the maximum pool size.
 * If this maximum limit has not been reached, a new thread is created to handle the task, preventing it from waiting in the queue.
 *
 * Maximum Pool Size Reached:
 * If the maximum pool size is reached and all threads are still busy, new tasks cannot be handled.
 * At this point, the thread pool will reject any further tasks. Different policies may determine what happens to these rejected tasks
 * (e.g., throwing an exception, discarding the task, or trying to resubmit later).
 *
 * Reusing Threads:
 * Once a thread finishes its assigned task, it doesn’t terminate but returns to the pool, ready to execute another queued task or wait for a new task.
 *
 *
 */


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * QUESTION -> why we have taken pool size is 3 4 , why not 10 15, what;s the logic?
 *
 * Choosing the right pool size depends on several factors, primarily related to the type of tasks
 *
 * CPU-bound Tasks
 *
 * What are they? Tasks that involve intensive calculations, which rely heavily on the CPU, such as data processing or image rendering.
 * Optimal Thread Count: Keep the number of threads close to the number of CPU cores available.
 * Reasoning: Since CPU-bound tasks keep the CPU busy, adding more threads than cores causes frequent context switching (when the CPU switches between threads). This switching adds overhead and slows down processing because the CPU spends extra time switching instead of computing.
 * Example: If there are 4 CPU cores, having 4 threads would maximize CPU usage efficiently, without wasting time on switching, giving better performance.
 *
 * I/O-bound Tasks
 * What are they? Tasks that frequently wait for external resources, such as file reading, network calls, or database queries.
 * Optimal Thread Count: A higher number of threads can be beneficial, sometimes even more than the number of cores, such as 11 or 12 threads.
 * Reasoning: In I/O-bound tasks, threads often sit idle, waiting for responses from external systems. By increasing the thread count, when one thread is waiting, others can continue executing, allowing better utilization of the CPU without it being tied up by waiting threads.
 * Example: During a network call, a thread might wait for the server’s response, allowing another thread to immediately begin processing its task. This setup maximizes the efficiency of I/O operations.
 *
 *
 * By adjusting the thread pool size based on whether tasks are CPU-bound or I/O-bound, you ensure optimal CPU usage and avoid the pitfalls of excessive context switching or idle waiting.
 */


/**
 * allowCoreThreadTimeOut(boolean value)
 * Description: By default, core threads (minimum threads in the pool) are not terminated even if they remain idle.
 * allowCoreThreadTimeOut(true) enables the core threads to time out and terminate if they are idle for the specified keepAliveTime.
 *
 * keepAliveTime
 * Description: Specifies how long a thread should stay alive when it’s idle before it is eligible for termination.
 * This applies to both core and non-core threads when allowCoreThreadTimeOut(true) is set.
 */




public class Threadpool {

    public static void main(String[] args) {

        CustomeRejectHandler customeRejectHandler=new CustomeRejectHandler();
        ThreadFactory threadFactory=new ThreadFactory();
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1,5,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(5),threadFactory,new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);

        for (int i=0;i<1000;i++){
            threadPoolExecutor.submit(()->{

                try {
                    Thread.sleep(1000);
                    System.out.println("Thread Name:  "+Thread.currentThread().getName());
                }
                catch (Exception e){

                }
            });
        }
        threadPoolExecutor.shutdown();
    }

}
