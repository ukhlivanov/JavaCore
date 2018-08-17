package JDBC;


import java.sql.*;

public class JdbcUtils {
    public static void initDriver(String str) {
        try {
            Class.forName(str);
        } catch (ClassNotFoundException ignore) {
            //throw new DBSystemException("initDriver() Class.forName() ClassNotFoundException", e);
        }
    }


    public static void rollbackQuietly(Connection con){
        if(con!=null){
            try {
                con.rollback();
            } catch (SQLException ignore) {
                //NOP
            }
        }
    }
    public static void closeQuietly(Statement st){
        if(st!=null){
            try {
                st.close();
            } catch (SQLException ignore) {
                //NOP
            }
        }
    }
    public static void closeQuietly(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ignore) {
                //NOP
            }

        }
    }
    public static void closeQuietly(ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ignore) {
                //NOP
            }
        }
    }
}
