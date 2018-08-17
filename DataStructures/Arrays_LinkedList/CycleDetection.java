package DataStructures.Arrays_LinkedList;


import tmp.Node;

import java.util.Scanner;

public class CycleDetection {

    public  static  int HasCycle(Node head) {
        if (head == null){
            return 0;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        int T1 = sc.nextInt();
        while(T1-->0){
            int ele = sc.nextInt();
            head = ComparTwoLinkedLists.insert(head,ele);
        }

        System.out.println(HasCycle(head));
    }
}
