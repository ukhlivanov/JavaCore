package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Home on 7/9/2017.
 */
public class Insertion {





    public static boolean check(Node root, int min, int max) {
        if (root != null) {
            if (root.data >= max || root.data <= min) {
                return false;
            }
            else {
                return check(root.left, min, root.data) & check(root.right, root.data, max);
            }
        }
        else {
            return true;
        }
    }

    public static boolean checkBST1(Node root) {
        return check(root, 0, Integer.MAX_VALUE);
    }


    public  static  boolean checkBST(Node root) {

        if(root!=null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                Node head = queue.remove();


                if(head.left!=null && head.data<=head.left.data ){
                    return false;
                }

                if(head.right!=null && head.data>=head.right.data ){
                    return false;
                }

                if(head.left!=null){
                    queue.add(head.left);
                }

                if(head.right!=null){
                    queue.add(head.right);
                }
            }
            return true;
        }else{
            return false;
        }

    }


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
//            Node node=new Node();
//            node.data=data;
//            node.left=null;
//            node.right=null;
//            root=node;

        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
       // return root;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }





    }
}
