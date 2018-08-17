package code30days.App24;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;


public class Solution {
    public  static  LinkedList<Node> myLinkedList = new LinkedList<Node>();

    public static LinkedList<Node> temp(Node head){
        myLinkedList.add(head);
        if(head.next!=null){
            temp(head.next);    
        }
        return myLinkedList;
    }

    public static Node removeDuplicates(Node head) {
        temp(head);
        ArrayList<Integer> tmp = new ArrayList<>();
        for (Node i : myLinkedList){
            tmp.add(i.data);
        }

        List<Integer> uniques = new ArrayList<>();
        for (Integer element : tmp) {
            if (!uniques.contains(element)) {
                uniques.add(element);
            }
        }

        Node newHead = null;
        for(Integer element: uniques){
            int ele = element;
            newHead = insert(newHead,ele);
        }

        return newHead;
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
    public static void display(Node head)
    {
        Node start = head;
        while(start != null)
        {
            System.out.print(start.data+" ");
            start = start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while(T-->0){

            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
