package DataStructures.Arrays_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        ArrayList<Integer> res = new ArrayList<>();
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int sum;
        for(int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                        arr[i+1][j+1]+
                            arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                res.add(sum);
            }
        }
        Collections.sort(res);
        System.out.println(res.get(15));
    }

}
