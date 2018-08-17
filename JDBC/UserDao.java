package JDBC;

import java.util.List;

public interface UserDao {
    public List<User> selectAll() throws DBSystemException;
    public int deleteById(int id) throws DBSystemException;
    public void insert(User user) throws DBSystemException, NotUniqueUserLoginException, NotUniqueUserEmailException;
}
