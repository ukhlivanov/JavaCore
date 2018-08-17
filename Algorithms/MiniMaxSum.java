package Algorithms;

import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int j=0;
        long minSum=0;
        long maxSum=0;
        long tmpSum=0;

        while (j < arr.length){

            for(int i=0; i<5; i++){
                if(j!=i){
                    tmpSum =tmpSum + arr[i];
                }
            }

            if (maxSum < tmpSum){
                maxSum = tmpSum;
            } else if (minSum > tmpSum || minSum==0) {
                        minSum = tmpSum;
                }

            j++;
            tmpSum=0;
        }

        System.out.print(minSum + " " + maxSum );
        //System.out.print(" " + maxSum);

    }
}
