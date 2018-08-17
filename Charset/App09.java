package Charset;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class App09 {
    public static void main(String[] args) throws IOException {
       /* OutputStream out = new FileOutputStream("...");
        OutputStream outBuff = new BufferedOutputStream(out, 64*1024);
        OutputStream outBuff1 = new GZIPOutputStream(out);*/

       new DataOutputStream(
               new GZIPOutputStream(
                       new BufferedOutputStream(
                               new FileOutputStream(
                                       new File("...")), 64*1024)))
               .writeDouble(123.456);
    }
}
