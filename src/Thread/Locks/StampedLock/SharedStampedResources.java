package Thread.Locks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedStampedResources {

    int a=10;
    StampedLock stampedLock=new StampedLock();

    public void produce( ){
        long stamp=stampedLock.tryOptimisticRead();

        try {
            System.out.println("Taken Optimistic lock");
            a=11;
            Thread.sleep(10000);
            if(stampedLock.validate(stamp)){
                System.out.println("update a value succesfully");
            }
            else {
                System.out.println("rollback a work");
                a=10;  //rollback
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void consume(){
        long stamp=stampedLock.writeLock();
        System.out.println("write lock acquired by: "+Thread.currentThread().getName());

        try {
            System.out.println("performing work");
        }
        finally {
            stampedLock.unlock(stamp);
            System.out.println("Write Lock Released by  :"+Thread.currentThread().getName());
        }
    }


}
