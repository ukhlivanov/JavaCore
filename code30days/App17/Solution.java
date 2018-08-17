package code30days.App17;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
                int n = sc.nextInt();
                int p = sc.nextInt();
                Calculator1 calculator = new Calculator1();
                try {
                    int ans = calculator.power(n,p);
                    System.out.println(ans);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
        }
    }
}
