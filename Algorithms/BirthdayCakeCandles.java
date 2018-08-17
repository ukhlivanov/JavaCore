package Algorithms;


import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        Arrays.sort(height);
        int tmp=1;
        for (int i=n-1; i>0; i--){
            if (height[i] == height[i-1] ){
                tmp++;
            }
        }
        System.out.println(tmp);
    }
}
