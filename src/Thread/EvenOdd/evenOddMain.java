package Thread.EvenOdd;

public class evenOddMain {

    public static void main(String[] args) {

        evenOdd evenOdd=new evenOdd();
        Thread t1=new Thread(()->{
            try {
                evenOdd.even();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()->{
            try {
                evenOdd.odd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
