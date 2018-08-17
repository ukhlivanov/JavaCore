package hackerrank;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class App19 {
    public static void main(String[] args) throws NumberFormatException, PatternSyntaxException {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
            for (int i=0;i<testCases;i++)
            {
                try {
                    String pattern = in.nextLine();
                    Pattern p = Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (NumberFormatException | PatternSyntaxException e) {
                    System.out.println("Invalid");
                }
            }
    }
}
