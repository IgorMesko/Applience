package by.htp.applience.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.applience.controller.command.impl.FindProductCommand;
import by.htp.applience.controller.command.impl.LoginCommand;

public class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("login", new LoginCommand());
		commands.put("findProduct", new FindProductCommand());
	}
	
	public Command takeCommand(String commandName) {
		return commands.get(commandName);
	}
}

