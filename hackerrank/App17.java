package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App17 {

    static boolean isAnagram(String a, String b) {

     char[] aa = a.toLowerCase().toCharArray();
     char[] bb = b.toLowerCase().toCharArray();

        List<Character> strA = new ArrayList<>();
        List<Character> strB = new ArrayList<>();

        for(char ch: aa)
        {
            strA.add(ch);
        }

        for(char ch: bb)
        {
            strB.add(ch);
        }

        Collections.sort(strA);
        Collections.sort(strB);

        if(strA.equals(strB)){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
