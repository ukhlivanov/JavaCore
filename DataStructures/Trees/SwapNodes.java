package DataStructures.Trees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SwapNodes {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[][] childs = new int[N][2];
            for (int i = 0; i < N; i++) {
                childs[i][0] = scan.nextInt();
                childs[i][1] = scan.nextInt();
            }
            NodeS root = createTree(childs);
            int T = scan.nextInt();
            while (T-- > 0) {
                swap(root, scan.nextInt());
                printInOrder(root);
                System.out.println();
            }
            scan.close();
        }

        public static NodeS createTree(int[][] childs) {
            NodeS root = new NodeS(1, 1);
            Queue<NodeS> queue = new LinkedList<>();
            queue.add(root);
            for (int i = 0; i < childs.length; i++) {
                NodeS head = queue.remove();
                int depth = head.depth + 1;
                if (childs[i][0] != -1) {
                    NodeS newNode = new NodeS(childs[i][0], depth);
                    head.left = newNode;
                    queue.add(newNode);
                }
                if (childs[i][1] != -1) {
                    NodeS newNode = new NodeS(childs[i][1], depth);
                    head.right = newNode;
                    queue.add(newNode);
                }
            }
            return root;
        }

        public static void swap(NodeS root, int K) {
            if (root != null) {
                Queue<NodeS> queue = new LinkedList<>();
                queue.add(root);
                while (!queue.isEmpty()) {
                    NodeS head = queue.remove();
                    if (head.depth % K == 0) {
                        NodeS tmp = head.left;
                        head.left = head.right;
                        head.right = tmp;
                    }
                    if (head.left != null) {
                        queue.add(head.left);
                    }
                    if (head.right != null) {
                        queue.add(head.right);
                    }
                }
            }
        }

        public static void printInOrder(NodeS root) {
            if (root != null) {
                printInOrder(root.left);
                System.out.print(root.index + " ");
                printInOrder(root.right);
            }
        }
    }

    class NodeS {
        int index;
        int depth;
        NodeS left;
        NodeS right;
        NodeS(int index, int depth) {
            this.index = index;
            this.depth = depth;
        }
}
