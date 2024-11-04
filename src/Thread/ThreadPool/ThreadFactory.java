package Thread.ThreadPool;

public class ThreadFactory implements java.util.concurrent.ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread=new Thread(r);
        return thread;
    }
}
