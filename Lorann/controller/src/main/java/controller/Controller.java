package controller;

import java.io.IOException;
import java.sql.SQLException;

import model.Element;
import model.dao.DAO;






public class Controller implements IController{

	@Override
	public void start(int i) throws SQLException {
		// TODO Auto-generated method stub
		
		DAO etienne = new DAO();
		
		System.out.println(etienne.readMap(1).length());
	}

	@Override
	public int chooseMap() { //opens menu for user to choose what level to play
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	
	
}
