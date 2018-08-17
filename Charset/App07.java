package Charset;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App07 {
    public static void main(String[] args) throws IOException {


        URL url = new URL("https://www.youtube.com/");
        InputStream inputStream = url.openStream();
        ByteArrayOutputStream bluff = new ByteArrayOutputStream();

        copy(inputStream, bluff);

        byte[] rawData = bluff.toByteArray();
        String html = new String(rawData, "ascii");
        System.out.println(html);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException{
        while (true){
            int elem = src.read();
            if (elem != -1){
                dst.write(elem);
            } else {break;}
        }
    }

}
