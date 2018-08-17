package tmp;

import java.util.LinkedList;
import java.util.Scanner;

class LinkedList1 {

 public static LinkedList<Node> myLinkList = new LinkedList<Node>();

    private static Node Reverse(Node head) {

        Node previous=null;
        Node next;
        while(head!=null){
            next=head.next;
            head.next=previous;
            previous=head;
            head=next;
        }
        return previous;
    }



    public static  Node insert(Node head,int data)
    {
        Node p = new Node(data);
        if(head == null)
            head = p;
        else if(head.next == null)
            head.next = p;
        else
        {
            Node start = head;
            while(start.next != null)
                start = start.next;
            start.next = p;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while(T-->0){

            int ele = sc.nextInt();
            head = insert(head,ele);
        }

        Node start = Reverse(head) ;

        while(start != null)
        {
            System.out.print(start.data+" ");
            start = start.next;
        }

    }

}


