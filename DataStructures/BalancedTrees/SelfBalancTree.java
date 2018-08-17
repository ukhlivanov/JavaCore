package DataStructures.BalancedTrees;

import java.util.Scanner;

/**
 * Created by Home on 7/14/2017.
 */
public class SelfBalancTree {
    public static Node insert(Node root, int val, int height) {
        if (root == null) {
            return new Node(val,height );
        } else {
            Node cur;
            if (val <= root.val) {
                cur = insert(root.left, val, height);
                root.left = cur;
            } else {
                cur = insert(root.right, val, height);
                root.right = cur;
            }
            return root;
        }
    }

    static Node insertBT(Node root,int val){
        if(root == null){
            root = new Node();
            root.val = val;
            root.ht = 0;
        }else if(val < root.val){
            root.left = insertBT(root.left, val);
            if(getHeight(root.left) - getHeight(root.right) == 2){
                if(getHeight(root.left.left) > getHeight(root.left.right))
                    root = LL(root);
                else
                    root = LR(root);
            }
        }else if(val > root.val){
            root.right = insertBT(root.right, val);
            if(getHeight(root.right) - getHeight(root.left) == 2){
                if(getHeight(root.right.right) > getHeight(root.right.left))
                    root = RR(root);
                else
                    root = RL(root);
            }
        }
        root.ht = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        return root;
    }
    static int getHeight(Node root){
        if(root == null) return -1;
        return root.ht;
    }
    static Node LL(Node root){
        Node t = root.left;
        root.left = t.right;
        t.right = root;
        root.ht = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        t.ht = Math.max(getHeight(t.left), getHeight(t.right)) + 1;
        return t;
    }
    static Node RR(Node root){
        Node t = root.right;
        root.right = t.left;
        t.left = root;
        root.ht = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        t.ht = Math.max(getHeight(t.left), getHeight(t.right)) + 1;
        return t;
    }
    static Node LR(Node root){
        root.left = RR(root.left);
        return LL(root);
    }
    static Node RL(Node root){
        root.right = LL(root.right);
        return RR(root);
    }

    static class Node {
        int val;   //Value
        int ht;      //Height
        Node left;   //Left child
        Node right;   //Right child

        public Node(int val, int ht) {
            this.val = val;
            this.ht = ht;
        }

        public Node() {

        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            int height = scan.nextInt();
            root = insert(root, data, height);
        }
        root = insertBT(root, scan.nextInt());
    }
}
