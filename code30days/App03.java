package code30days;


import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            if(n!=5){
            ans = "Weird1";}
        }
        else{
            if (n>=2 || n<=5){
                ans ="Not Weird";
            }
            if (n>=6 || n<=20){
                ans ="Weird2";
            }
            if (n>20){
                ans ="Weird3";
            }
        }
        System.out.println(ans);
    }
}
