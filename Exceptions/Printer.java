package Exceptions;

public class Printer {
    public void print (String str) throws PrinterException{
    if(System.nanoTime() %2 == 0){
            throw  new PrinterException( new NullPointerException("abc"),1,45, str);
        }
    }
}

