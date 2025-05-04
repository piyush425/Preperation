import java.util.HashMap;
import java.util.Map;

class LRUCache{
    class Node{
        int key;
        int value;

        Node prev;
        Node next;

        Node(int k, int v){
            this.key=k;
            this.value=v;
        }
    }

    private final int capacity;
    private final Map<Integer,Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity){
        this.capacity=capacity;
        this.map=new HashMap<>();

        this.head=new Node(0,0);
        this.tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
    }

    public int get(int k){
        if(!map.containsKey(k)){
            return -1;
        }
        Node newNode=map.get(k);
        remove(newNode);
        addToFront(newNode);
        return newNode.value;

    }

    public void put(int k,int v){
        if(map.containsKey(k)){
            remove(map.get(k));
            map.remove(k);

        }
        if (map.size()==capacity){
            map.remove(tail.prev.value);
            remove(map.get(tail.prev));
        }
        Node node=new Node(k,v);
        addToFront(node);
        map.put(k,node);
    }

    public void addToFront(Node newNode) {

        head.next.prev=newNode;
        newNode.next=head.next;
        head.next=newNode;
        newNode.prev=head;

    }

    public void remove(Node newNode) {
        newNode.prev.next=newNode.next;
        newNode.next.prev=newNode.prev;
    }
    private void printCache() {
        Node curr=head.next;
        while (curr!=tail){
            System.out.println(curr.key+"-->"+curr.value);

            curr=curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(3);

        lruCache.put(3,9);
        lruCache.put(4,8);
        lruCache.put(5,7);
        lruCache.printCache();
        lruCache.get(4);
        lruCache.printCache();

    }




}