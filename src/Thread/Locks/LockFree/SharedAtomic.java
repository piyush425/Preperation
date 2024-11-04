package Thread.Locks.LockFree;

public class SharedAtomic {

//    AtomicInteger atomicInteger=new AtomicInteger(0);
    volatile int count=0;

    //private int count = 0; // No synchronization or atomicity here

    public void increment() {
        count++; // This operation is not thread-safe
    }
//public void increment() {
//    atomicInteger.incrementAndGet(); // This operation is not thread-safe
//}

    public int get() {
        return count;
    }

//    public int get() {
//        return atomicInteger.get();
//    }
}
