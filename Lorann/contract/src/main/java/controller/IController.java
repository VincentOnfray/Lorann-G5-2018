package controller;

import java.sql.SQLException;

public interface IController {
	
	public void start(int i) throws SQLException ;
	
	public int chooseMap();
	
	/*public element[][] buildMap(int map);*/
	
	public void play();
}
