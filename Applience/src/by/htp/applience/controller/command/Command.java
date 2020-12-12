package by.htp.applience.controller.command;

import by.htp.applience.service.ServiceException;

public interface Command {
	
	String execute(String request) throws ServiceException;

}
