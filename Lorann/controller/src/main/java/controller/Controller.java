package controller;

import java.sql.SQLException;

import model.Demon;
import model.Element;
import model.dao.DAO;






public class Controller implements IController{

	@Override
	public void start() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("ah");
		
	}

	@Override
	public int chooseMap() { //opens menu for user to choose what level to play
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void play(int map) throws SQLException {
		// TODO Auto-generated method stub
		DAO etienne = new DAO();
		System.out.println(etienne.readMap(1));
	}

	@Override
	public boolean chekAI(Demon demon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void won() {
		// TODO Auto-generated method stub
		
	}

	
	
}
