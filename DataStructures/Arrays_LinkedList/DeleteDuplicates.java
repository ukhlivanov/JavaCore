package DataStructures.Arrays_LinkedList;

import tmp.Node;

import java.util.Scanner;


public class DeleteDuplicates {

    public static Node RemoveDuplicates(Node head) {

        if (head == null || head.next == null) {
            return null;
        }
        if (head.data == head.next.data) {
            Node next_next = head.next.next;
            head.next = null;
            head.next = next_next;
            RemoveDuplicates(head);
        } else {
            RemoveDuplicates(head.next);
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        int T1 = sc.nextInt();
        while(T1-->0){
            int ele = sc.nextInt();
            head = ComparTwoLinkedLists.insert(head,ele);
        }

        head = RemoveDuplicates(head);

        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
