package code30days;


import java.util.*;

public class App07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];

        for (int i =0; i<n;i++){
            int k = sc.nextInt();
            arr[i] = k;
        }

        for (int i=arr.length;i>0;i--){
        System.out.print(arr[i-1]);
        System.out.print(" ");}

    }
}
