package hackerrank;

import java.util.Scanner;

public class App01{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        String s = scan1.next();
        System.out.print("String: " + s);
        while (scan1.hasNext()){
            String str = scan1.toString();
            System.out.print(" " + scan1.next());

        }

        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();




    }
}