package by.htp.applience.service;

import by.htp.applience.service.impl.ApplienceServiceImpl;
import by.htp.applience.service.impl.UserServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider INSTANCE = new ServiceProvider();
	private final UserService userService = new UserServiceImpl();
	private final ApplienceService applienceService = new ApplienceServiceImpl();
	
	private ServiceProvider() {}

	public static ServiceProvider getInstance() {
		return INSTANCE;
	}

	public UserService getUserService() {
		return userService;
	}

	public ApplienceService getApplienceService() {
		return applienceService;
	}
	
}
