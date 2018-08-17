package DataStructures.Arrays_LinkedList;


import tmp.Node;

import java.util.Scanner;


public class MergePoint {

    public static int FindMergeNode(Node headA, Node headB) {

        Node currA = headA;
        Node currB = headB;

        while (currA != currB) {
            if (currA.next == null) {
                currA = headB;
            } else {
                currA = currA.next;
            }

            if (currB.next == null) {
                currB = headA;
            } else {
                currB = currB.next;
            }
        }
        return currB.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node headA = null;
        Node headB = null;

        int T1 = sc.nextInt();
        while(T1-->0){
            int ele = sc.nextInt();
            headA = ComparTwoLinkedLists.insert(headA,ele);
        }

        int T2 = sc.nextInt();
        while(T2-->0){
            int ele = sc.nextInt();
            headB = ComparTwoLinkedLists.insert(headB,ele);
        }

        System.out.println(FindMergeNode(headA,headB));

    }
}

