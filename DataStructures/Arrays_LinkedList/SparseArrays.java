package DataStructures.Arrays_LinkedList;


import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        String s1;
        String s2 = null;

        String[] arrStr = new String[n];
        for (int i=0; i<n; i++){
            arrStr[i] = in.next();
        }

        int m = in.nextInt();
        String[] arrQue = new String[m];
        for (int i=0; i<m; i++){
            arrQue[i] = in.next();
        }

        for (int i=0; i<arrQue.length; i++){
            s1 = arrQue[i];
            for (int j=0; j<arrStr.length; j++) {
                s2 = arrStr[j];
                if (s1.equals(s2)) {
                    count++;
                }
                }
            System.out.println(count);
            count=0;
            }
        }
}
