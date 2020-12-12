package by.htp.applience.controller.command.impl;

import by.htp.applience.controller.command.Command;
import by.htp.applience.entity.Applience;
import by.htp.applience.service.ApplienceService;
import by.htp.applience.service.ServiceException;
import by.htp.applience.service.ServiceProvider;

public class FindProductCommand implements Command{

	@Override
	public String execute(String request) throws ServiceException {
		ServiceProvider provider = ServiceProvider.getInstance();
		ApplienceService service = provider.getApplienceService();
		
		Applience applience = service.findProduct(request);
		String result = applience.toString();
		
		if(result.isEmpty()) {
			return result;
		} else {
			return "Product is not found.";
		}
	}

}
