package by.htp.applience.service.impl;

import by.htp.applience.dao.DaoException;
import by.htp.applience.dao.DaoProvider;
import by.htp.applience.dao.UserDao;
import by.htp.applience.service.ServiceException;
import by.htp.applience.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public boolean logination(String login, String password) throws ServiceException{
		boolean result;
		if (login == null || password == null || password.length() < 10) {
			result = false;
		}
		else {
			DaoProvider provider = DaoProvider.getInstance();
			UserDao userDAO = provider.getUserDao();
			try {
				result = userDAO.autorization(login, password);
			} catch (DaoException e) {
				throw new ServiceException(e);
			}
		}
		return result;
	}

}
