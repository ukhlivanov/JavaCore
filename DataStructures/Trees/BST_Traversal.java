package DataStructures.Trees;


import java.util.Scanner;

public class BST_Traversal {



    public static void inOrder(Node root) {


        if(root.left!=null){
            preOrder(root.left);
        }
        System.out.println(root.data);
        if(root.right!=null){
            preOrder(root.right);
        }
    }


   public static void preOrder(Node root) {

        System.out.println(root.data);

        if(root.left!=null){
            preOrder(root.left);
        }
        if(root.right!=null){
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root) {

        if(root.left!=null){
            preOrder(root.left);
        }
        if(root.right!=null){
            preOrder(root.right);
        }
        System.out.println(root.data);
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
        System.out.println("PreOrder traversal:");
        preOrder(root);
        System.out.println("InOrder traversal:");
        inOrder(root);
        System.out.println("PostOrder traversal:");
        postOrder(root);


    }
}
