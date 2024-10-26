package Thread;

public class pingPong {

    boolean isPingPong=false;

    public synchronized void ping() throws InterruptedException {
        while (isPingPong){
            wait();
        }
        System.out.println("ping");
        isPingPong=true;
        notify();
    }
    public synchronized void pong() throws InterruptedException {
        while (!isPingPong){
            wait();
        }
        System.out.println("pong");
        isPingPong=false;
        notify();
    }
}
