package by.htp.applience.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.htp.applience.dao.DaoException;
import by.htp.applience.dao.UserDao;

public class FileUserDao implements UserDao{

	private static final String USER_APPLIANCES_TXT = "D:\\workplace\\Applience\\resource\\user.txt";;
	
	@Override
	public boolean autorization(String login, String password) throws DaoException{
		boolean check = false;
		try(BufferedReader reader = new BufferedReader(new FileReader(USER_APPLIANCES_TXT))){
			String line;
			while((line = reader.readLine()) != null) {
				if(line.contains(login) && line.contains(password)) {
					check = true;
				}
			}
		} catch (FileNotFoundException e) {
			throw new DaoException("Check file name or path.", e);
		} catch (IOException e) {
			throw new DaoException("Check file.", e);
		}
		return check;
	}

}
