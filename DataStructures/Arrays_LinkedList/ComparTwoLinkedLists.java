package DataStructures.Arrays_LinkedList;


import tmp.Node;

import java.util.Scanner;



public class ComparTwoLinkedLists {


    public  static Node insertNth(Node head, int data, int position) {
        Node dummy = head;
        Node tmp;
        Node runner = dummy;
        for (int i = 0; i < position; ++i) {
            runner = runner.next;
        }

        if(position==0){
            Node node = new Node();
            node.data = data;
            node.next = runner;
        }else {
                tmp = head.next;

        }


        return head;
    }

    public static Node mergeLists(Node list1, Node list2) {

            if (list1 == null) return list2;
            if (list2 == null) return list1;

            if (list1.data < list2.data) {
                list1.next = mergeLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeLists(list2.next, list1);
                return list2;
            }

    }

    public static  int CompareLists(Node a, Node b) {

            try {
                if (a == null && b == null) {
                    return 1;
                } else if(a.data != b.data){
                    return 0;
                }else{
                    return CompareLists(a.next, b.next);
                }
            }catch (NullPointerException e){
                return 0;
            }
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
        Node headA = null;
        Node headB = null;

        int T1 = sc.nextInt();
        while(T1-->0){
            int ele = sc.nextInt();
            headA = insert(headA,ele);
        }

        int T2 = sc.nextInt();
        while(T2-->0){
            int ele = sc.nextInt();
            headB = insert(headB,ele);
        }

//        System.out.println(CompareLists(headA, headB));

        Node merge = mergeLists(headA, headB);

        while (merge!= null){
            System.out.println(merge.data);
            merge = merge.next;
        }


    }
}
