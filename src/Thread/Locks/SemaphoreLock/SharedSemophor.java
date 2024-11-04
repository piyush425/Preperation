package Thread.Locks.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedSemophor {

    boolean isAvailable=false;
    Semaphore SemaphoreLock=new Semaphore(3);

    public void producer(){
        try {
            SemaphoreLock.acquire();
            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            SemaphoreLock.release();
            System.out.println("Lock Released by:  "+Thread.currentThread().getName());
        }
    }
}
