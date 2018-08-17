package code30days.App25;

import java.util.Scanner;

public class newSolution {

    public static String isPrime(int n){
        if(n == 1){
            return "Not prime";
        }
        if(n == 2){
            return "Prime";
        }
        for (int i = 2; i*i<=n; i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++){
            System.out.println(isPrime(sc.nextInt()));
        }
    }
}
