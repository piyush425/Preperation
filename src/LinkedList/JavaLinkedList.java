package LinkedList;

import java.util.LinkedList;

public class JavaLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();
        list.add(2);
        list.add(3);

        list.add(1,7);

        list.offer(9);

        System.out.println(list.peek());
    }
}
