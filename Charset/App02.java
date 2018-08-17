package Charset;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("A".getBytes("UTF-16").length);
    }
}
