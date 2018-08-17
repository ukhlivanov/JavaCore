package Exceptions;

public class App01 {
    public static void main(String[] args) {

        try {
            System.out.println(0);
            if(true){
                //RuntimeException ex = new RuntimeException("Hello");
                throw new RuntimeException("Hello");
            }
            System.out.println(1);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(2);
            throw e;
        } catch (Error e){
            System.out.println(3);
        }
        System.out.println(4);
    }
}
