package Thread;

public class deadLock {
    public static void main(String[] args) {

        final Object resurce1="piyush";
        final Object resurce2="ranjan";

        Thread t1=new Thread(()->{

            synchronized (resurce1){
                System.out.println("Resource 1");
                try {
                    Thread.sleep(50);
                    synchronized (resurce2){
                        System.out.println("Resource 2");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        Thread t2=new Thread(()->{

            synchronized (resurce2){
                System.out.println("Resource 2");
                try {
                    Thread.sleep(50);
                    synchronized (resurce1){
                        System.out.println("Resource 1");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        t1.start();
        t2.start();

    }
}
