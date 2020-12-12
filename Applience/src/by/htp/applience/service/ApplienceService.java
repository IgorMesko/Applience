package by.htp.applience.service;

import by.htp.applience.entity.Applience;

public interface ApplienceService {

	Applience findProduct(String request) throws ServiceException;
}
