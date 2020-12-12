package by.htp.applience.dao;

import by.htp.applience.dao.impl.FileApplienceDao;
import by.htp.applience.dao.impl.FileUserDao;

public class DaoProvider {
	
	private static final DaoProvider INSTANCE = new DaoProvider();
	private UserDao userDao = new FileUserDao();
	private ApplienceDao applienceDao = new FileApplienceDao();
	
	private DaoProvider() {}	

	public static DaoProvider getInstance() {
		return INSTANCE;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public ApplienceDao getApplienceDao() {
		return applienceDao;
	}

}
