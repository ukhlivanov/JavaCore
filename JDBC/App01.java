package JDBC;
import java.sql.*;
public class App01{
    //STEP 1. Import required packages

    public static class FirstExample {
        // JDBC driver name and database URL
     //   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        public  static final String DB_URL = "jdbc:mysql://127.0.0.1/jdbc";
        public  static final String SELECT_ALL_SQL = "SELECT id, name, email FROM testjava";
        public  static final String DELETE_BY_ID_SQL ="DELETE FROM testjava WHERE id=?";
        public  static final String INSERT_SQL = "INSERT INTO testjava (name, email) values(?,?)";
        public  static final String SELECT_BY_LOGIN = "SELECT id FROM testjava WHERE name=?";
        public  static final String SELECT_BY_EMAIL = "SELECT id FROM testjava WHERE email=?";

        //  Database credentials
        static final String USER = "root";
        static final String PASS = "qwe321$";

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try{
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                //STEP 3: Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);

                //STEP 4: Execute a query
                System.out.println("Creating statement...");
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SELECT_ALL_SQL);

                System.out.println("ALL CURRENT USERS:");

                //STEP 5: Extract data from result set
                while(rs.next()){
                    //Retrieve by column name
                    int id  = rs.getInt("ID");
                    String name = rs.getString("Name");
                    String email = rs.getString("Email");

                    //Display values
                    System.out.print("ID= " + id);
                    System.out.print(",Name= " + name);
                    System.out.print(",Email= " + email);
                    System.out.println();
                }
                //STEP 6: Clean-up environment
                rs.close();
                stmt.close();
                conn.close();
            }catch(SQLException se){
                //Handle errors for JDBC
                se.printStackTrace();
            }catch(Exception e){
                //Handle errors for Class.forName
                e.printStackTrace();
            }finally{
                //finally block used to close resources
                try{
                    if(stmt!=null)
                        stmt.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(conn!=null)
                        conn.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try
            System.out.println("Goodbye!");
        }//end main
    }//end FirstExample

}
