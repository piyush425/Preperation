package Thread.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResources {

    Queue queue;
    int bufferSize;

    public SharedResources(int bufferSize) {
        queue=new LinkedList();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int i) throws InterruptedException {

        while (queue.size()==bufferSize){
            System.out.println("producer is full. Let consumer consume the message: size");
            wait();
        }
        queue.add(i);
        System.out.println("Item added: "+i);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()){
            System.out.println("queue is empty. Let procuser produce the message");
            wait();
        }
        Object poll=queue.poll();
        System.out.println(poll.toString());
        notify();

    }
}
