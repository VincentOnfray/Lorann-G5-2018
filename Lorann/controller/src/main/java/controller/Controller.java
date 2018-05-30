package controller;

import java.io.IOException;
import java.io.StringReader;
import java.sql.SQLException;

import model.*;
import model.dao.DAO;
import view.*;





public class Controller implements IController{
	
	private boolean finished;
	 
	@Override
	public void start() throws SQLException {
		// TODO Auto-generated method stub
		this.finished = false;
		this.play( this.chooseMap()); //allows to choose map and start the game loop
		
	}

	
	@Override 
	public void loop(Map map) {//the main game loop
		this.display();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.updateModel(map);
		
	}
	
	@Override
	public void play(String mapchoice) throws SQLException{
		// TODO Auto-generated method stub
		DAO etienne = new DAO();
		
		Map map = this.createMap(etienne.readMap(mapchoice));
		while (!this.finished) {
			this.loop(map);
		}
		
		
		}
	
	@Override
	public String chooseMap() { //opens menu for user to choose what level to play
	
		Console menu = new Console(); //simple Console menu for now, will be enhanced if time allows
		
		return menu.whatMap();
	}

	@Override
	public boolean chekAI(Map map,Demon demon, int i) {
		// TODO Auto-generated method stub
		String classe;
		switch (i) {
		case 1: //up Y-1
			classe = map.getCell(demon.getX(), demon.getY()-1).getClass().toString();
			switch (classe) {
			case "classe BallWall" :
				break;
				
				
				
				
				
				
				
				
				
				
				
				default:
			}
			
			break;
		case 2://down  Y+1
			
			break;
		case 3: //left X-1
			
			break;
		case 4: //right X+1
			
			break;
			
			
			
			
			default:
		
		
		
		}
		
		
		
		
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateModel(Map map) { //TO DO
		int n = map.getnDemon()-1; //Demonlist's 1st demon is number 0, not 1
		for(int i = 0; i <n; i++) { 
			double r = Math.random()%5; //generate a random movement
			switch ((int)r) {
			
			
			case 1: //moveUp (Y-1)
				if (this.chekAI(map,map.getDemon(i), 1)){
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					map.getDemon(i).setY(map.getDemon(i).getY()-1);
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));
				}
				else {
					
				}
				
				break;
			case 2: //moveDown (Y+1)
				if (this.chekAI(map,map.getDemon(i), 2 )){
				map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
				map.getDemon(i).setY(map.getDemon(i).getY()+1);
				map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));}
				
				else {
					
				}
				break;
			case 3: //move Left (X-1)
				
				if (this.chekAI(map,map.getDemon(i), 3 )){
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					map.getDemon(i).setX(map.getDemon(i).getX()-1);
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));}
					
					else {
						
					}
				break;
				
			case 4:    //move right (X+1)

				if (this.chekAI(map,map.getDemon(i), 4 )){
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					map.getDemon(i).setX(map.getDemon(i).getX()+1);
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));}
					
					else {
						
					}
				break;
				default:					
			}
		}
		return;
	}

	

	@Override
	public Map createMap(String mapString) {   //Done
		// TODO Auto-generated method stub
		Map map = new Map();
		
		StringReader sr = new StringReader(mapString);
		for(int Y = 0; Y<13; Y++ ) { //
			
		for(int X = 0;X<21;X++) { 
			
			try {
				switch ((char)sr.read()) {
				case ';':
					break;
				case 'O':
					map.setCell(X,Y,new BallWall());
					break;
				case '-':
					map.setCell(X,Y,new XWall());
					break;
				case 'I':
					map.setCell(X,Y,new YWall());
					break;
				case '1':
					map.setCell(X,Y,new Gold());
					break;
				case 'D':
					map.setCell(X,Y,new Demon(X,Y));
					map.setnDemon(map.getnDemon()+1);
					break;
				case 'Q':
					map.setCell(X,Y,new Cristal());
					break;
				case 'Y':
					map.setCell(X,Y,new CloseDoor());
					break;
				case '@':
					map.setLorann(new Player(X,Y));
					map.setCell(X, Y,map.getLorann() ); //PlaceHolder, Lorann needs to be instantiated earlier
					break;
				case '+':
					map.setCell(X,Y,new Grave());
					break;
				case 'e':
					map.setCell(X,Y,new Ground());
					break;
					
				default:
					map.setCell(X,Y,new Ground());
					
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		}
		
		return map;
	}

	
	@Override
	public void lost() { //TO DO
		// TODO Auto-generated method stub
		
	}

	@Override
	public void won() { //TO DO
		// TODO Auto-generated method stub
		
	}
	
	
}
