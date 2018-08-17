package Exceptions;

public class App04 {
    public static void main(String[] args) {
        new Thread(
                new Runnable() {
                    @Override
                    public void run()
                    {
                    while (true){
                        System.out.println("Hello!");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    }
                }
        ).start();

        throw new Error();
    }
}
