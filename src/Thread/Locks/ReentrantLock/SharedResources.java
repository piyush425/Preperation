package Thread.Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResources {

    boolean isAvailable=false;
    ReentrantLock reentrantLock=new ReentrantLock();

    public void producer(){
        try {
            reentrantLock.lock();
            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            reentrantLock.unlock();
            System.out.println("Lock Released by:  "+Thread.currentThread().getName());
        }
    }


}
