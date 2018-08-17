package DataStructures.Trees;


import java.util.Scanner;

public class PrevAndNextNumbers {


 public static void findCloserPrevNumber(Node root, int num){
     int tmp=0;
     int prevNum;

     while(root.data != num){
         if(root.data<num){
             tmp = root.data;
             root = root.right;
         }else{
             root = root.left;
         }
     }

         if(root.left != null){
             root = root.left;
             while(root.right!=null){
                 root = root.right;
             }
             prevNum = root.data;
         }else {

             prevNum = tmp;
         }

     System.out.println(prevNum);
 }

    public static void findCloserNextNumber(Node root, int num){
        int tmp=0;
        int nextNum;

        while(root.data != num){
            if(root.data<num){
                root = root.right;
            }else{
                tmp = root.data;
                root = root.left;
            }
        }

        if(root.right != null){
            root = root.right;
            while(root.left!=null){
                root = root.left;
            }
            nextNum = root.data;
        }else {

            nextNum = tmp;
        }

        System.out.println(nextNum);
    }



    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }

        System.out.println("Enter num:");
        int num=sc.nextInt();

        findCloserPrevNumber(root, num);
        findCloserNextNumber(root, num);

    }
}
