package DataStructures.Arrays_LinkedList;

import tmp.Node;

import java.util.Scanner;


public class GetNodValue {
   public static int GetNode(Node head,int n) {

       Node previous=null;
       Node next;
       int c=0;
       while(head!=null){
           next=head.next;
           head.next=previous;
           previous=head;
           head=next;
           c++;
       }

       if(n==0){
           return previous.data;
       }else {
           for(int i=0; i<c-n; i++){
               previous = previous.next;
           }
           return previous.data;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        int T1 = sc.nextInt();
        while(T1-->0){
            int ele = sc.nextInt();
            head = ComparTwoLinkedLists.insert(head,ele);
        }

        int p = sc.nextInt();
        System.out.println(GetNode(head,p));
    }
}

