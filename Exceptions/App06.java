package Exceptions;


public class App06 {
    public static void main(String[] args) {
        try(FailClose x = new FailClose("X")){
            try(FailClose y = new FailClose("Y")){
               /*NOP*/
            }

        } catch (Error e) {
            RuntimeException error;
            if (e.getCause() == null){
                error = new RuntimeException(e.getMessage());
            }
            else {
                error = new RuntimeException(e.getMessage(), e.getCause());
            }

            for(Throwable elem : e.getSuppressed()){
                error.addSuppressed(elem);
            }
            throw error;
        } finally {
            System.err.println("Finally");
        }
    }
}
