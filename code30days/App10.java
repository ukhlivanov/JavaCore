package code30days;

import java.util.*;

public class App10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String[] t =Integer.toBinaryString(k).split("[0]+");
        int count=0;

        for (String i : t){
            if (i.length() > count){
                count = i.length();
            }
        }
         System.out.println(count);
    }
}
