package Exceptions;

import java.util.Arrays;

public class App02 {
    public static void main(String[] args) throws Exception {
        try(X x0 = new X("0"); X x1 = new X("1"); X x2 = new X("2")) {
            Exception exception = new Exception("try", new Error());
            exception.addSuppressed(new RuntimeException());
            exception.addSuppressed(new StackOverflowError());
            throw exception;
        }

        catch (Throwable t){
            System.err.println("cause: " + t.getCause());
            System.err.println("msg: " + t.getMessage());
            System.err.println("suppressed: " + Arrays.toString(t.getSuppressed()));
        }

        finally {
            System.err.println("finally");
        }
    }
}

class X implements AutoCloseable{
private String name;

    public X(String name) {
        this.name = name;
        System.err.println("new:" + name);

    }

    @Override
    public void close() throws Exception {
        System.err.println("close:" + name);
        throw new RuntimeException(name);
    }
}
