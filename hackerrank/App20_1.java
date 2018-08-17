package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App20_1 {

    private String string = new String();

    public App20_1(String string) {
        this.string = string;
    }

    public App20_1() {

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public static boolean pattern(String testString){
        Pattern p = Pattern.compile("^([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
                                    "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
                                    "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\" +  \n" +
                                    "\"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])$");
        Matcher m = p.matcher(testString);
        return m.matches();}

}
