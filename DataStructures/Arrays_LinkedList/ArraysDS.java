package DataStructures.Arrays_LinkedList;


import java.util.Scanner;
import java.util.Stack;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack stack = new Stack();
        for(int arr_i=0; arr_i < n; arr_i++){
            stack.add(arr_i+1);
        }

        for (int i=0; i<n; i++){
            System.out.print(stack.pop() + " ");
        }
    }
}
