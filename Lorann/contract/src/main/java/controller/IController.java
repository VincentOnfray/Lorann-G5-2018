package controller;


import java.sql.SQLException;

import model.Demon;
import model.Map;
import view.Frame;
import view.Panel;

public interface IController {

	
	public void start() throws SQLException; 				//sets up for play() 
	public void play(String mapchoice) throws SQLException; // Self explanatory
	public Map createMap(String mapString);				//Generates the map, it the Heart of the Model
	public boolean chekAI(Demon demon ,int i); //checks if AI movement is deeadly to Lorann, then if it is possible
	public void display();//updates the visual Display
	public void checkMovement();
	public void updateModel(Map map);		 	//updates the logical model of the game
	public void lost();  				//triggers "lost" scenario
	String chooseMap();  				//Simple console menu, placeholder
	void loop(Map map, Frame frame);    //This is the game loop, as long as it runs, the game is not over
	
}
