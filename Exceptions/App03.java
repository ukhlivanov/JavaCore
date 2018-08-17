package Exceptions;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App03 {
    public static void main(String[] args) throws Throwable {
        ResultSet rs;
        PreparedStatement stmt;
        Connection conn;

        /*try(Connection conn = DriverManager.getConnection("");
            PreparedStatement stmt = conn.prepareStatement(null);
            ResultSet rs = stmt.executeQuery())
        {
            System.out.println("123");
        }
        finally {
            rs.close();
            stmt.close();
            conn. close();

        }*/
    }
}
