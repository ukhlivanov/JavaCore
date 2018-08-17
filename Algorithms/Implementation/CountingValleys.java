package Algorithms.Implementation;


import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        char [] arr = str.toCharArray();
        int j=0;
        int count=0;

        for(int i=0; i<n; i++){

            if (arr[i]=='D'){
                j--;
            }

            if (arr[i]=='U') {
                j++;
                if (j == 0 && arr[i] == 'U') {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}
