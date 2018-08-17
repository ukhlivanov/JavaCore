package Charset.Entity;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class EntityRun {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        new EntityDataOutput(
                new DataOutputStream(buff)).writePerson( new Person("Mike", 45, new Person.Sex[] {Person.Sex.M}));
        byte[] bytes = buff.toByteArray();

        System.out.println(bytes.length);
        System.out.println(new String(bytes));
    }
}
