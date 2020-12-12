package by.htp.applience.controller.command.impl;

import by.htp.applience.controller.command.Command;
import by.htp.applience.service.ServiceException;
import by.htp.applience.service.ServiceProvider;
import by.htp.applience.service.UserService;

public class LoginCommand implements Command{
	
	@Override
	public String execute(String request) throws ServiceException {
		String[] command = request.split("\\s+");
		String login = command[1].split("=")[1];
		String password = command[2].split("=")[1];
		
		ServiceProvider provider = ServiceProvider.getInstance();
		UserService user = provider.getUserService();
		
		boolean result = user.logination(login, password);
		
		if(result == true) {
			return "Login successful.";
		} else {
			return "Please check username or password.";
		}
	}

}
