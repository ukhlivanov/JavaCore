package Charset;


import java.util.Scanner;

public class App18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        s = s.replace("!", " ");
        s = s.replace(",", " ");
        s = s.replace("?", " ");
        s = s.replace(".", " ");
        s = s.replace("_", " ");
        s = s.replace("'", " ");
        s = s.replace("@", " ");

        s = s.trim();

        if (s.length() > 400000) {
            return;
        } else if (s.length() == 0) {
            System.out.println(0);
            return;
        } else {

            String[] splitStr = s.split("\\s+");
            System.out.println(splitStr.length);
            for (String ch : splitStr) {
                System.out.println(ch);
            }
            scan.close();
        }
    }
}
