package JDBC;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class UserDaoJdbc implements UserDao {

    public  static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    public  static final String JDBC_URL = "jdbc:mysql://127.0.0.1/jdbc?autoReconnect=true&useSSL=false";
    public static final String LOGIN = "root";
    public static final String PASSWORD = "qwe321$";

    public  static final String SELECT_ALL_SQL = "SELECT id, name, email FROM testjava1";
    public  static final String DELETE_BY_ID_SQL ="DELETE FROM testjava1 WHERE id=?";
    public  static final String INSERT_SQL = "INSERT INTO testjava1 (name, email) values(?,?)";
    public  static final String SELECT_BY_LOGIN = "SELECT id FROM testjava1 WHERE name=?";
    public  static final String SELECT_BY_EMAIL = "SELECT id FROM testjava1 WHERE email=?";

    static {
        JdbcUtils.initDriver(DRIVER_CLASS_NAME);
    }

    private Connection getConnection() throws DBSystemException{
        try{
            return DriverManager.getConnection(JDBC_URL, LOGIN, PASSWORD);
        }catch (SQLException e){
            throw new DBSystemException("Can't create connection:", e);
        }
    }

    @Override
    public List<User> selectAll() throws DBSystemException {
        Connection conn = getConnection();
        Statement statement = null;
        ResultSet rs = null;
        try
        {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            rs = statement.executeQuery(SELECT_ALL_SQL);
            List<User> result = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String login = rs.getString("name");
                String email = rs.getString("email");
                User user = new User(id);
                user.setLogin(login);
                user.setEmail(email);
                result.add(user);
            }
            conn.commit();
            return result;
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't execute SQL = '" + SELECT_ALL_SQL + "'");

        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(statement);
            JdbcUtils.closeQuietly(conn);
        }
    }

    @Override
    public int deleteById(int id) throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement ps = null;

        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(DELETE_BY_ID_SQL);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            conn.commit();
            return result;
        }catch (SQLException e){
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't execute SQL = '" + DELETE_BY_ID_SQL + "'");
        } finally {
            JdbcUtils.closeQuietly(ps);
            JdbcUtils.closeQuietly(conn);
        }
    }

    @Override
    public void insert(User user) throws DBSystemException, NotUniqueUserLoginException, NotUniqueUserEmailException {
        Connection conn = getConnection();
        PreparedStatement ps = null;

        try{
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);

            if (existWithLogin0(conn, user.getLogin())){
                throw new NotUniqueUserLoginException("Login '" + user.getLogin() + "' already exist!");
            }

            if (existWithEmail0(conn, user.getEmail())){
                throw new NotUniqueUserEmailException("Email '" + user.getEmail() + "' already exist!");
            }

            ps = conn.prepareStatement(INSERT_SQL);
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getEmail());
            ps.executeUpdate();
            conn.commit();
        }catch (SQLException e){
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't execute SQL = '" + INSERT_SQL + "'");
        } finally {
            JdbcUtils.closeQuietly(ps);
            JdbcUtils.closeQuietly(conn);
        }
    }

    private boolean existWithLogin0(Connection conn, String login) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(SELECT_BY_LOGIN);
        ps.setString(1, login);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    private boolean existWithEmail0(Connection conn, String email) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(SELECT_BY_EMAIL);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
}
