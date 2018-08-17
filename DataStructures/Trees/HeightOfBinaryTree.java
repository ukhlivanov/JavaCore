package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HeightOfBinaryTree {



    public static void levelOrder(Node root) {

      if(root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            System.out.println(root.data);

            if(root.left!=null){
                queue.add(root.left);
            }
            if(root.right!=null){
                queue.add(root.right);

            }

        }

    }

    public static void top_view(Node root, boolean tmp){

        if (root!=null){
            if(tmp){
                top_view(root.left,tmp);
                System.out.println(root.data + " ");
            }else {
                System.out.println(root.data + " ");
                top_view(root.right,tmp);
            }
        }
    }

    public static void topView(Node root) {

        if(root!=null){
            top_view(root, true);
            top_view(root.right, false);
        }

    }

      public static int getHeight(Node root) {
          if (root == null) {
              return -1;
          }

          int lefth = getHeight(root.left);
          System.out.println(root.data + " lefth = " + lefth);

          int righth = getHeight(root.right);
          System.out.println(root.data + " right = " + righth);

          if (lefth > righth) {
              return lefth + 1;
          } else {
              return righth + 1;
          }
        }

        public static Node insert(Node root, int data) {
            if (root == null) {
                return new Node(data);
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
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            Node root = null;
            while (t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            scan.close();
            //topView(root);
            levelOrder(root);


        }

}

