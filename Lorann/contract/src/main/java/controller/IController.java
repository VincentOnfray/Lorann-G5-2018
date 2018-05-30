package controller;

import java.sql.SQLException;

import model.Demon;
import model.Map;

public interface IController {

	
	public void start() throws SQLException; 
	public void play(String mapchoice) throws SQLException;
	public Map createMap(String mapString);
	public boolean chekAI(Map map,Demon demon ,int i); //checks if AI movement is deeadly to Lorann, then if it is possible
	public void display(Map map); 				//updates the visual Display
	public void updateModel(Map map);		 	//updates the logical model of the game
	public void lost();  				//triggers "lost" scenario
	public void won();  				//triggers "Won" scenario
	String chooseMap();  				//Simple console menu, placeholder
	void loop(Map map);
	
}
