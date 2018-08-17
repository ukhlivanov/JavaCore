package code30days;

import java.util.Scanner;

public class App16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try{
            int res = Integer.parseInt(s);
            System.out.println(res);

        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }


    }
}
