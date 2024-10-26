package Thread.MulthreadMechanism;

public class RunnableStage {


    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());// New state
        Thread t2 = new Thread(new MyThread()); // New state

        t1.start(); // Runnable state
        t2.start(); // Runnable state
    }

}
