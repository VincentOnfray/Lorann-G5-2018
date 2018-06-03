package controller;


import java.sql.SQLException;

import model.Demon;
import model.Map;



public interface IController {

	
	public void start() throws SQLException; 				//sets up for play() 
	public void play(String mapchoice) throws SQLException; // play a single level
	public Map createMap(String mapString);					//Generates the map, it the Heart of the Model
	public boolean checkAI(Demon demon ,int i); 			//checks if AI movement is deadly to Lorann, then if it is possible
	public void display();									//updates the visual Display
	public void checkMovement();							//checks if a movement was ordered during the last loop()
	public void updateModel();		 						//updates the logical model of the game
	public void lost();  									//triggers "lost" scenario
	String chooseMap();  									//Simple console menu, placeholder
	public void loop();    									//This is the game loop, as long as it runs, the game is not over
	public void won();										//triggers "win" scenario
	
}
