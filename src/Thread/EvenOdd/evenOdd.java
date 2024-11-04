package Thread.EvenOdd;

public class evenOdd {

    private Object lock=new Object();
     boolean isEven=false;

    public synchronized void even() throws InterruptedException {

        for (int i=2;i<10;i+=2){
            if (!isEven){
                wait();
            }
            System.out.println("Even: "+i);
            isEven=false;
            notify();
        }

    }

    public synchronized void odd() throws InterruptedException {

        for (int i=1;i<10;i+=2){
            if (isEven){
                wait();
            }
            System.out.println("Odd: "+i);
            isEven=true;
            notify();
        }

    }

}
