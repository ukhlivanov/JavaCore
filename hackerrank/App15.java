package hackerrank;

import java.util.*;

public class App15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int k = in.nextInt();

        char[] c = S.toCharArray();
        List<String> strSet = new ArrayList<>();

        for (int i=0;i<c.length; i++)
        {
                if (k<=c.length)
                {
                    String subStr = S.substring(i,k);
                    k++;
                    strSet.add(subStr);
                }
        }
        Collections.sort(strSet);
        System.out.println(strSet.get(0));
        System.out.println(strSet.get(strSet.size()-1));
    }
}

