package DataStructures.Arrays_LinkedList;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        for (int j=0;j<m;j++) {
            int tmp = arr[0];
            for (int i = 0; i < n-1; i++) {
                arr[i]=arr[i+1];
            }
            arr[n-1]=tmp;
        }

        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
