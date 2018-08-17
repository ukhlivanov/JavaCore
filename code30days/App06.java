package code30days;


import java.util.Scanner;

public class App06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <n; i++) {
            String s = in.next();
            char[] c = s.toCharArray();
            int k=1;
           for (int l = 1; l <c.length; l=l+2) {
                if (k==1)
                {
                    for (int j = 0; j < c.length; j = j + 2) {
                        System.out.print(c[j]);
                        k=0;
                    }
                }
                if (k==0){
                    System.out.print(" ");
                    k=2;
                }
                System.out.print(c[l]);
               }
            System.out.println();
            }
    }
}


