package hackerrank;


import java.util.Scanner;
import java.util.regex.Pattern;

public class App20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new App20_2().pattern));
        }
    }
}

class App20_2 {

    public String pattern;

    public App20_2() {
        Pattern p = Pattern.compile("^([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
                "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
                "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
                "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])$");
 //       Matcher pattern = p.matcher(p);

 //       return pattern;
    };

    public void setString(String string) {
        this.pattern = string;
    }

//    public Matcher pattern(String testString) {
//        Pattern p = Pattern.compile("^([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
//                "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
//                "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
//                "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])$");
//        Matcher pattern = p.matcher(testString);
//
//       return pattern;
//
//    }
}



