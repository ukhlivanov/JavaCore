package DataStructures.Arrays_LinkedList;


import java.util.Scanner;

public class DoublyLL {
    private static  Node head;
    private Node tail;

    public static class Node {
        int element;
        Node next;
        Node prev;

        public Node(int element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public Node() {

        }
    }

    public  void addFirst(int element) {

        Node tmp = new Node(element, head, null);

        if(head != null ) {
            head.prev = tmp;
        }
        head = tmp;

        if(tail == null) {
            tail = tmp;
        }
        System.out.println("adding: "+element);
    }
    public void addLast(int element) {

        Node tmp = new Node(element, null, tail);

        if(tail != null) {
            tail.next = tmp;
        }

        tail = tmp;

        if(head == null) {
            head = tmp;
        }
        System.out.println("adding: "+element);
    }


    public static Node SortedInsert(Node head,int data)
    {
        Node n = new Node();
        n.element = data;
        if (head == null) {
            return n;
        }
        else if (data <= head.element) {
            n.next = head;
            head.prev = n;
            return n;
        }
        else {
            Node rest = SortedInsert(head.next, data);
            head.next = rest;
            rest.prev = head;
            return head;
        }

    }

    public static Node ReverseDLL(Node head){

        Node prev = null;
        Node next;
        if(head==null){
            return head;
        }

        while (head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            prev.prev = next;
            head = next;


        }
        return prev;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLL list = new DoublyLL();

        int T1 = sc.nextInt();
        while(T1-->0){
            if(list.head==null){
                list.addFirst(sc.nextInt());
            }else{
                list.addLast(sc.nextInt());
            }
        }

        //int data = sc.nextInt();
        //Node tmp = SortedInsert(head, data);
        Node tmp = ReverseDLL(head);
        System.out.println("printing...");
        while(tmp!=null){
            System.out.println(tmp.element);
            tmp = tmp.next;
        }

    }

}



