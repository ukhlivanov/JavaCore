package hackerrank;

import java.util.Scanner;


public class App13{
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();

            String AB = new StringBuilder().append(A).append(B).toString();
            System.out.println(AB.length());


            int compare = A.compareTo(B);
            if (compare <= 0)
            {
                System.out.println("No");
            }
            else
            {
                if (compare > 0){
                    System.out.println("Yes");
                }
            }
            A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
            B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();

            System.out.println(A + " " + B);


        }
}
