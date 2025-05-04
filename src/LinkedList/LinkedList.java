package LinkedList;



public class LinkedList {

    //Deleteing a node ddl
//    class Solution
//    {
//        // function returns the head of the linkedlist
//        Node deleteNode(Node head,int x)
//        {
//            // Your code here
//
//            if(x==1){
//                if(head.next!=null){
//                    head=head.next;
//                    head.prev=null;
//                    return head;
//
//                }
//                else{
//                    return null;
//                }
//            }
//            Node temp=head;
//
//            for(int i=1;i<x;i++){
//                temp=temp.next;
//            }
//            temp.prev.next=temp.next;
//            return head;
//        }
//    }

    //reverse with DDL
//    public static Node reverseDLL(Node  head)

//    {
//        //Your code here
//        Node current=head;
//        Node prev=null;
//
//        while(current!=null){
//            Node temp=current.next;
//            current.next=prev;
//            current.prev=temp;
//            prev=current;
//            current=current.prev;
//
//        }
//
//        return prev;

//    }





    //reverse with sll
//    class Solution {
//        public ListNode reverseList(ListNode head) {
//
//            ListNode current=head;
//            ListNode prev=null;
//
//            while(current!=null){
//                ListNode newNode=current.next;
//                current.next=prev;
//                prev=current;
//                current=newNode;
//            }
//
//            return prev;
//
//
//
//        }
//    }


    //insert node
    void addNode(Node head_ref, int pos, int data) {
        Node curr = head_ref;

        for (int i = 0; i < pos; i++) {

            curr = curr.next;
        }

        Node newData = new Node(data);
        newData.prev = curr;
        newData.next = curr.next;

        if (curr.next != null) {
            curr.next.prev = newData;
        }

        curr.next = newData;
    }


//    class Solution {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//            ListNode head=new ListNode(0);
//            ListNode temp=head;
//            int carry=0;
//
//            while(l1!=null || l2!=null){
//                int x=0;
//                if(l2!=null){
//                    x=l2.val;
//                }
//                int y=0;
//                if(l1!=null){
//                    y=l1.val;
//                }
//                int sum=x+y+carry;
//                carry=sum/10;
//                temp.next=new ListNode(sum%10);
//                temp=temp.next;
//                if(l2!=null){
//                    l2=l2.next;
//                }
//
//                if(l1!=null){
//                    l1=l1.next;
//                }
//            }
//            if(carry>0){
//                temp.next=new ListNode(carry);
//            }
//            head=head.next;
//            return head;
//        }
//    }
}
