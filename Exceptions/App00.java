package Exceptions;

import java.io.IOException;

public class App00 {
    public static void main(String[] args)  {
        try {
            f();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void f() throws IOException, InterruptedException {
        if(System.nanoTime() % 2 ==0) {
            throw new IOException();
        }
        else{
            throw new InterruptedException();
        }
    }
}
