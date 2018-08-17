package Charset;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class App11 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new GZIPOutputStream(
                        new LogOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream(
                                                new File("E:/tmp/123.txt"))))));
        for (int i = 0; i < 1000; i++) {
            out.writeDouble(123.456);
        }

        out.flush();
        out.close();

        DataInputStream in = new DataInputStream(
                new GZIPInputStream(
                        new FileInputStream(
                                new File("E:/tmp/123.txt"))));
        for (int i = 0; i < 1000; i++) {
            System.out.println(in.readDouble());
        }
    }
}

class LogOutputStream extends OutputStream {

    private final OutputStream out;

    public LogOutputStream(OutputStream out) {
        this.out = out;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println(" >> Log: 1");
        out.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println(" >> Log: " + b.length + " " + new String(b));
        out.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println(" >> Log: " + len + " " + new String(b, off, len));
        out.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}
