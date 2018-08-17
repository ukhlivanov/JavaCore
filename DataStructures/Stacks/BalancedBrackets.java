package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Home on 7/19/2017.
 */
public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String s = in.next();
            System.out.println((YesOrNo(s)) ? "YES" : "NO");
        }
    }

    private static boolean YesOrNo(String s) {

        if (s.length() == 1) {
            return false;
        } else {

            char[] arrBracket = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            for (char iterator : arrBracket) {

                switch (iterator){
                    case '{':
                        stack.push('}');
                        break;

                    case '(':
                        stack.push(')');
                        break;

                    case '[':
                        stack.push(']');
                        break;

                    default:
                        if (stack.empty() || iterator != stack.peek()) {
                            return false;
                        }
                        stack.pop();
                }

            }

            return stack.empty();
        }


    }


}