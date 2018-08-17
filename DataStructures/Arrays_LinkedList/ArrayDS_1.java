package DataStructures.Arrays_LinkedList;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayDS_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=in.nextInt();
            arr1[i]=in.nextInt();
        }
        for (int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println(Arrays.equals(arr,arr1));

    }
}
