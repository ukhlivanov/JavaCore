package DataStructures.Trees;


import java.util.Scanner;

public class LowestCommonAncestor {



    public  static Node lca(Node root,int v1,int v2)
    {
        if(root == null){
            return null;
        }

        if(v1<root.data && v2<root.data){
            root = lca(root.left, v1, v2);
            return root;
        }

        if(v1>root.data && v2>root.data){
            root = lca(root.right, v1, v2);
            return root;
        }
      return root;
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

        int v1 = scan.nextInt();
        int v2 = scan.nextInt();

        Node tmp = lca(root, v1,v2);
        System.out.println(tmp.data);

    }
}
