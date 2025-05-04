package LinkedList;

import java.util.LinkedList;

class  Node{
    int value;
    Node prev;
    Node next;

    public Node(int data){
        this.prev=null;
        this.next=null;
        this.value=data;
    }
}

class DoublyLinkedList{
    Node head;

    public void append(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    public void prepend(int data) {

    }

}

public class JavaLinkedList {

    public static void main(String[] args) {


    }
}
