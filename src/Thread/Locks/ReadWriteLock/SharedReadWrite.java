package Thread.Locks.ReadWriteLock;


import java.util.concurrent.locks.ReadWriteLock;

public class SharedReadWrite {

    boolean isAvailable=false;

    public void produce(ReadWriteLock lock){

        try {
            lock.readLock().lock();
            System.out.println("Read Lock Acquired by :     "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock Released by  :"+Thread.currentThread().getName());
        }
    }
    public void consume(ReadWriteLock lock){

        try {
            lock.writeLock().lock();
            System.out.println("write Lock Acquired by :     "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock Released by  :"+Thread.currentThread().getName());
        }

    }
}
