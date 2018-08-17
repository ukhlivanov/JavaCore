package DataStructures.Queues;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++){

            int operant = in.nextInt();

            switch (operant){
                case 1 :
                    int enqueue = in.nextInt();
                    queue.add(enqueue);
                    break;
                case 2 :
                    queue.remove();
                    break;

                case 3 :
                    System.out.println(queue.peek());
                    break;
            }

        }

    }
}
