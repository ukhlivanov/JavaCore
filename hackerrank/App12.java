package hackerrank;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            Set<Character> characterSet = new HashSet<>();
            char[] c = s.toCharArray();
            for(char ch: c)
            {
                characterSet.add(ch);
            }
            System.out.println(characterSet.size());
        }
    }
}
