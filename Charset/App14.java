package Charset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App14 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] b = {1,2,3,4};
        int i=0;
        char c;

        try{
            fos = new FileOutputStream("E:/Java/1234.txt", true);
            fos.write(b);
            fos.flush();

            fis = new FileInputStream("E:/Java/1234.txt");

            while(true){
                if ((i = fis.read()) != -1){
                    c =(char)i;
                    System.out.print(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
           if (fos!=null){fos.close();}
           if (fis!=null){fis.close();}
        }
    }
}
