package by.htp.applience.controller;

import by.htp.applience.controller.command.Command;
import by.htp.applience.controller.command.CommandProvider;
import by.htp.applience.service.ServiceException;

public class Controller {
	
	private final CommandProvider provider = new CommandProvider();
	
	public String doAction(String request) throws ServiceException{
		String commandName = request.split("\\s+", 2)[0];
		Command command = provider.takeCommand(commandName);
		return command.execute(request);
	}
}
