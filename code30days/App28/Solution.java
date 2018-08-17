package code30days.App28;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static boolean regEx(String testString){
        Pattern p = Pattern.compile(".+(@gmail.com)");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        boolean chek;
        ArrayList res= new ArrayList();

        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            chek = regEx(emailID);
            if (chek == true){
                res.add(firstName);
            }
        }
        Collections.sort(res);
        Iterator <String> itr = res.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
