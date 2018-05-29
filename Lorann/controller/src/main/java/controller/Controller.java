package controller;

import java.io.IOException;
import java.io.StringReader;
import java.sql.SQLException;

import model.*;
import model.dao.DAO;
import view.*;





public class Controller implements IController{

	@Override
	public void start() throws SQLException {
		// TODO Auto-generated method stub
		
		this.play( this.chooseMap()); //allows to choose map and start the game loop
		
	}

	@Override
	public String chooseMap() { //opens menu for user to choose what level to play
		// TODO Auto-generated method stub
		Console menu = new Console(); //simple Console menu for now, will be enhanced if time allows
		
		return menu.whatMap();
	}

	@Override
	public void play(String mapchoice) throws SQLException{
		// TODO Auto-generated method stub
		DAO etienne = new DAO();
		this.createMap(etienne.readMap(mapchoice));
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

	@Override
	public Map createMap(String mapString) {
		// TODO Auto-generated method stub
		Map map = new Map();
		
		StringReader sr = new StringReader(mapString);
		for(int Y = 0; Y<13; Y++ ) {
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
					map.setCell(X,Y,new Demon());
					
				
					break;
				case 'Q':
					map.setCell(X,Y,new Cristal());
					break;
				case 'Y':
					map.setCell(X,Y,new CloseDoor());
					break;
				case '@':
					map.setCell(X, Y, new Player()); //PlaceHolder, Lorann needs to be instantiated earlier
					
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
		
		
		
		//System.out.println(map.getCell(19, 2).getClass());		//tests Should return "YWall" on map 1
		//System.out.println(map.getCell(5, 5).getClass());			//Should return "Demon" on map 1
		
		return map;
	}

	
	
}
