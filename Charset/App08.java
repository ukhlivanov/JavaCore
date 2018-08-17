package Charset;

import java.io.*;
import java.net.URL;
import java.net.UnknownHostException;

public class App08 {
    public static void main(String[] args) throws IOException
    {
        URL url = new URL("https://www.youtube.com/");

       try(InputStream inputStream = url.openStream();
           OutputStream buff = new FileOutputStream(new File("E:/tmp/youtube.html")))
            {
                copy(inputStream, buff);
            } catch (UnknownHostException e){
                 System.out.println("Bad connection, site " + e.getMessage() + " can't be open!");
                 System.out.println(e.getCause());
            }
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException
    {
     /*   while (true)
        {
            int elem = src.read();
            if (elem != -1)
            {
                dst.write(elem);
            } else {break;}
        }*/
        byte[] bytes = new byte[1024];
        int count;
            while ((count = src.read(bytes)) != -1){
                dst.write(bytes,0,count);
            }

    }
}
