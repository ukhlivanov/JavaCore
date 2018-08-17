package tmp;

import java.util.Scanner;

public class tmp6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(permutation(str));
    }
     public static String permutation(String str) {
     permutation(str, "");
         return str;
     }
    public static void permutation(String str, String prefix) {
     if (str.length() == 0) {
         System.out.println(prefix);
         } else {
         for (int i = 0; i < str.length(); i++) {
             String rem = str.substring(0, i) + str.substring (i + 1);
             permutation(rem, prefix + str.charAt(i));
         }
        }
    }
}
