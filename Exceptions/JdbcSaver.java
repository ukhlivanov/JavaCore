package Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSaver {
    public void save(String info) throws SQLException{
        //can be thrown: SQLException
        //Strategy: ignore
        Connection conn = DriverManager.getConnection("....");

        try {
            //... work with conn
            conn.commit(); //все что я делал необходимо сохранить
        } catch (Exception e){
            conn.rollback(); //все что я делал необходимо отменить
            //Strategy: catch and rethrow old
            throw e;
        } finally {
            conn.close();
        }

    }
}
