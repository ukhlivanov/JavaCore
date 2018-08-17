package Algorithms;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum1=0;
        int sum2=0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                   sum1 = sum1+a[i][j];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(i+j==n-1){
                   sum2 = sum2+a[i][j];
               }
            }
        }

        System.out.println(Math.abs(sum1-sum2));
    }
}
