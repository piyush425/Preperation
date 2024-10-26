package Thread;

public class MultiMain {

    public static void main(String[] args) throws InterruptedException {

        pingPong pingPong=new pingPong();

        Thread t1=new Thread(()->{

            for (int i=1;i<=10;i++){
                try {
                    pingPong.ping();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        Thread t2=new Thread(()->{

            for (int i=1;i<=10;i++){
                try {
                    pingPong.pong();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        t1.start();
        t2.start();
    }
}
