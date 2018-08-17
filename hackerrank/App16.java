package hackerrank;

import java.util.Scanner;

public class App16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String revS = new StringBuffer(s).reverse().toString();

        if (s.compareTo(revS)>0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }




    }
}
