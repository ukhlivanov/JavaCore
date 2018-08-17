package DataStructures.Arrays_LinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        int[] tmp = new int[m*3];

        for (int i=0; i<m*3; i++){
            tmp[i] = in.nextInt();
        }

        for (int i=0; i<tmp.length; i=i+3){
                for(int j=tmp[i]; j<=tmp[i+1]; j++){
                    arr[j-1]=arr[j-1]+tmp[i+2];
                }
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }
}

