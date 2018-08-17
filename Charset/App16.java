package Charset;

import java.io.File;

public class App16 {
    public static void main(String[] args) {
        File file = new File("E:/tmp/");
        walk(file);

        int i=6;
        App15 rec = new App15();
        System.out.println(rec.recursion(i));
    }

    public static void walk(File root){
        if (root.isFile()){
            System.out.println("File: " + root);
        }else {
            File[] files = root.listFiles();
            for (File file : files){
                walk(file);
            }
        }
    }

}
