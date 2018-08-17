package code30days;

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        int i =4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner sc = new Scanner(System.in);
        int i1= sc.nextInt();
        double d1 = sc.nextDouble();
        sc.nextLine();
        String s1 = sc.nextLine();

        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s + " " + s1);
    }
}
