package DataStructures.BalancedTrees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SelfBalancingTree {
    public static NodeBT insertNew(NodeBT root, int val, int height) {
        if (root == null) {
            return new NodeBT(val,height );
        } else {
            NodeBT cur;
            if (val <= root.val) {
                height = height+1;
                cur = insertNew(root.left, val, height);
                root.left = cur;
            } else {
                height = height+1;
                cur = insertNew(root.right, val, height);
                root.right = cur;
            }
            return root;
        }
    }
    public static NodeBT insert(NodeBT root, int val, int height) {
        if (root == null) {
            return new NodeBT(val,height );
        } else {
            NodeBT cur;
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

    static class NodeBT {
        int val;   //Value
        int ht;      //Height
        NodeBT left;   //Left child
        NodeBT right;   //Right child

        public NodeBT(int val, int ht) {
            this.val = val;
            this.ht = ht;
        }
    }

    public static int heightOfTheTree(NodeBT root){
        NodeBT head = null;
        if (root == null) {
            return 0;
        } else {
            Queue<NodeBT> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                head = queue.remove();
                    if (head.left != null) {
                        queue.add(head.left);
                    }
                    if (head.right != null) {
                        queue.add(head.right);
                    }
            }

        }
        return head.ht;
    }

    public static NodeBT insertBT(NodeBT root,int val)
    {

        root = insertNew(root, val, 1);
        int heightLeft = heightOfTheTree(root.left);
        int heightRight = heightOfTheTree(root.right);
        NodeBT newNode = root;
        if(Math.abs(heightLeft-heightRight)>1){

            if(heightLeft<heightRight){
                for(int i=0; i<heightRight-3; i++){
                    newNode = newNode.right;
                }
                newNode.left = new NodeBT(newNode.val,newNode.ht+1);
                newNode.val = newNode.right.val;
                newNode.right.val = newNode.right.right.val;
                newNode.right.left=null;
                newNode.right.right=null;
//                NodeBT head = newNode.right;
//                NodeBT tmp = head.left;
//                head.left = newNode;
//                head.left.right = tmp;
//                root.right = head;


            }else {
                for(int i=0; i<heightLeft-3; i++){
                    newNode = newNode.left;
                }
                newNode.right = new NodeBT(newNode.val,newNode.ht+1);
                newNode.val = newNode.left.val;
                newNode.left.val = newNode.left.left.val;
                newNode.left.left=null;
                newNode.left.right=null;
            }

        }

        return root;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        NodeBT root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            int height = scan.nextInt();
            root = insert(root, data, height);
        }
        root = insertBT(root, scan.nextInt());
    }
}
