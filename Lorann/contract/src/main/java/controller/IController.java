package controller;

import java.sql.SQLException;

import model.Demon;

public interface IController {

	
	public void start() throws SQLException;
	public void play(int map) throws SQLException;
	//public Map createMap(String mapString);
	public boolean chekAI(Demon demon);
	public void display();
	public void updateModel();
	public void lost();
	public void won();
	int chooseMap();
	
}
