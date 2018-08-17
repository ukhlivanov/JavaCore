package Algorithms;

import java.util.Scanner;

/**
 * Created by Home on 6/2/2017.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double r1=0;
        double r2=0;
        double r3=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }


        for(int arr_i=0; arr_i < n; arr_i++) {
            if (arr[arr_i] > 0) {
                r1++;
            }
            if (arr[arr_i] == 0) {
                r2++;
            }
            if (arr[arr_i] < 0) {
                r3++;
            }
        }
        System.out.println((r1/n));
        System.out.println((r3/n));
        System.out.println((r2/n));

    }
}
