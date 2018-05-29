package controller;

import java.io.IOException;
import java.sql.SQLException;

import model.Element;
import model.dao.DAO;






public class Controller implements IController{

	@Override
	public void start(int i) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("lol");
		Element el = new Element();
		el.testouille();
		DAO etienne = new DAO();
		etienne.readMap(1);
	}

	@Override
	public int chooseMap() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	
	
}
