package Practice;

public class Practice {
    public static void main(String[] args) {
        final Object resource1="resource1";
        final Object resource2="resource2";

        Thread t1=new Thread(()->{

            synchronized (resource1){
                System.out.println("resource1");
                try {
                    Thread.sleep(1000);
                    synchronized (resource2){
                        System.out.println("resource2");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        Thread t2=new Thread(()->{

            synchronized (resource2){
                System.out.println("resource2");
                try {
                    Thread.sleep(1000);
                    synchronized (resource1){
                        System.out.println("resource2");
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
