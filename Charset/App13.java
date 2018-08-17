package Charset;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class App13 {
    public static void main(String[] args) {
        File file = new File("E:/Java/123.txt");
       // FileInputStream fis = null;

        try(FileInputStream fis = new FileInputStream(file);) {

            System.out.println("Total file size to read (in bytes) : " + fis.available());

            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
//        finally {
//            try {
//                if (fis != null)
//                    fis.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
    }
}

