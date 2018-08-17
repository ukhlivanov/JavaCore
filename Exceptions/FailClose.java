package Exceptions;

import java.io.FileNotFoundException;

public class FailClose implements AutoCloseable {
    private String msg;

    public FailClose(String msg) {
        this.msg = msg;
        System.err.println("new:" + msg);
    }

    @Override
    public void close() {
        System.err.println("close:" + msg);
        throw new Error(msg, new FileNotFoundException());
    }
}
