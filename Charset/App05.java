package Charset;


import java.io.UnsupportedEncodingException;

public class App05 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = "AA".getBytes("UTF-16");
        String str  = new String(bytes, "UTF-16");
        System.out.println(str);
    }
}
