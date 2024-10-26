package Thread.EvenOdd;

public class evenOdd {

     boolean  isEven=false;

    public synchronized void even() throws InterruptedException {

        if (isEven){
            wait();
        }
        isEven=true;
        notify();

    }

    public synchronized void odd() throws InterruptedException {

        if (!isEven){
            wait();
        }
        isEven=false;
        notify();

    }

}
