package by.htp.applience.main;

import by.htp.applience.controller.Controller;
import by.htp.applience.service.ServiceException;

public class Main {

	public static void main(String[] args) throws ServiceException {
		
		String command;
		String response;
		Controller controller = new Controller();
		
		command = "login login=Admin password=12345";
		response = controller.doAction(command);
		
		command = "findProduct Oven HEIGHT=45.5";
		response = controller.doAction(command);
	}

}
