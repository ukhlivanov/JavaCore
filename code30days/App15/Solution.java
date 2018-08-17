package code30days.App15;

import java.util.Scanner;

public class Solution {
    public static  Node insert(Node head,int data) {

        if(head == null) {
            head = new Node(data);
            return head;
        }
        head.next = insert(head.next, data);
        return head;

    }


    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}
