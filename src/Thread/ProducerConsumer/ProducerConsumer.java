package Thread.ProducerConsumer;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        SharedResources sharedResources=new SharedResources(10);

        Thread t1=new Thread(()->{

            for (int i=0;i<11;i++){
                try {
                    sharedResources.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread t2=new Thread(()->{

            for (int i=0;i<11;i++){
                try {
                    sharedResources.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main Method is complete");
    }
}
