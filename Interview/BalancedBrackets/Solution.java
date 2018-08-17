package Interview.BalancedBrackets;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }

    private static boolean isBalanced(String expression) {

        // Must be even
        if ((expression.length() & 1) == 1) return false;
        else {
            char[] brackets = expression.toCharArray();
            Stack<Character> s = new Stack<>();
            for (char bracket : brackets)
                switch (bracket) {
                    case '{': s.push('}'); break;
                    case '(': s.push(')'); break;
                    case '[': s.push(']'); break;
                    default :
                        if (s.empty() || bracket != s.peek())
                            return false;
                        s.pop();
                }
            return s.empty();
        }
    }
}

