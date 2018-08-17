package code30days;


import java.util.Scanner;

public class App09 {
    private static int factorial(int i) {

        if (i == 1) {
            return i;
        } else {
            int j=factorial(i-1)*i;
            return j;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}
