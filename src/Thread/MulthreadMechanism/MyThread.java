package Thread.MulthreadMechanism;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }


}
