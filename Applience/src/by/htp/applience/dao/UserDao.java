package by.htp.applience.dao;

public interface UserDao {
	
	boolean autorization(String login, String password) throws DaoException;

}
