package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.io.StringReader;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.*;
import model.Object;
import model.dao.DAO;
import view.*;





public class Controller implements IController{
	
	private boolean finished;
	private Factory fact;
	private LorannController lorannControl;
	private Frame frame;
	private Map map;
	@Override
	public void start() throws SQLException {
		// TODO Auto-generated method stub
		this.finished = false;
		this.fact = new Factory();
		
		this.play( this.chooseMap()); //allows to choose map and start the game loop
		
	}
	
	@Override
	public String chooseMap() { //opens menu for user to choose what level to play
	
		Console menu = new Console(); //simple Console menu for now, will be enhanced if time allows
		
		return menu.whatMap();
	}
	
	
	@Override
	public void play(String mapchoice) throws SQLException{
		// TODO Auto-generated method stub
		DAO etienne = new DAO();
		this.map = this.createMap(etienne.readMap(mapchoice));
		this.frame = new Frame(map.getGrid());
		this.lorannControl = new LorannController(map,frame);

		
		
		while (!this.finished) {
			this.loop(map, frame);
			
		}
		
		
		}
	

	@Override
	public void display() {
		
		this.frame.getPanel().repaint();
		
		// TODO Auto-generated method stub
		
	}
	
	@Override 
	public void loop(Map map, Frame frame) {//the main game loop
		this.display();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.updateModel(map);
		this.lorannControl.attemptMoveLeft();
	}
			

	@Override
	public boolean chekAI(Demon demon, int i) {
		// TODO Auto-generated method stub
		boolean possible = false;
		String classe;
		//System.out.println(demon.getX()+" "+ demon.getY());
		switch (i) {
		case 1: //Y-1 up
			if(demon.getY()>0) {
				if(!this.map.getCell(demon.getX(),demon.getY()-1).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX() && this.map.getLorann().getY()== demon.getY()-1) {
						this.finished=true;
						this.lost();
					}else if(this.map.getCell(demon.getX(),demon.getY()-1) instanceof Cristal || this.map.getCell(demon.getX(),demon.getY()-1)  instanceof Gold) {
						
							possible= false;
						}
					}
				}else {}
			break;
			
			
		case 2: //Y+1 Down
			
			if(demon.getY()>0) {
				if(!this.map.getCell(demon.getX(),demon.getY()+1).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX() && this.map.getLorann().getY()== demon.getY()+1) {
						this.lost();
						this.finished=true;
								}else if(this.map.getCell(demon.getX(),demon.getY()+1) instanceof Cristal || this.map.getCell(demon.getX(),demon.getY()+1)  instanceof Gold) {
									possible= false;
						}
					}
				}else {}
			break;
			
			
			
			
		case 3: //X-1 gauche
			if(demon.getY()>0) {
				if(!this.map.getCell(demon.getX()-1,demon.getY()).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX()-1 && this.map.getLorann().getY()== demon.getY()) {
						this.lost();
						this.finished=true;
							}else if(this.map.getCell(demon.getX()-1,demon.getY()) instanceof Cristal || this.map.getCell(demon.getX()-1,demon.getY())  instanceof Gold) {
								possible= false;
						}
					}
				}else {}
			break;
			
			
			
			
		case 4: //X+1 droite
			if(demon.getY()>0) {
				if(!this.map.getCell(demon.getX()+1,demon.getY()).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX()+1 && this.map.getLorann().getY()== demon.getY()) {
						this.lost();
						this.finished=true;
							}else if(this.map.getCell(demon.getX()+1,demon.getY())  instanceof Cristal || this.map.getCell(demon.getX()+1,demon.getY())  instanceof Gold) {
								possible= false;
						}
					}
				}
					else {}
			break;
			}
			
			
			
			return possible;
		
		}
				

	@Override
	public void updateModel(Map map) { //TO DO
		int n = map.getnDemon()-1; //Demonlist's 1st demon is number 0, not 1
		
		for(int i = 0; i <= n; i++) { 
			
			double r = (Math.random()*10)%5; //generate a random movement
			
			switch ((int)r) {
			case 1: //moveUp (Y-1)
				
				
				if (this.chekAI(map.getDemon(i), 1)){
					try {
						map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					map.getDemon(i).setY(map.getDemon(i).getY()-1);
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));
				}
				else {
					
				}
				
				break;
			case 2: //moveDown (Y+1)
				
				if (this.chekAI(map.getDemon(i), 2 )){
				try {
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				map.getDemon(i).setY(this.map.getDemon(i).getY()+1);
				map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));}
				
				else {
					
				}
				break;
			case 3: //move Left (X-1)
				
				if (this.chekAI(this.map.getDemon(i), 3 )){
					try {
						map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					map.getDemon(i).setX(map.getDemon(i).getX()-1);
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));}
					
					else {
						
					}
				break;
				
			case 4:    //move right (X+1)

				if (this.chekAI(map.getDemon(i), 4 )){
					try {
						map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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
					map.setCell(X,Y,fact.newballWall());
					break;
				case '-':
					map.setCell(X,Y,fact.newxWall());
					break;
				case 'I':
					map.setCell(X,Y,fact.newyWall());
					break;
				case '1':
					map.setCell(X,Y,fact.newGold());
					break;
				case 'D':
					map.setDemon(map.getnDemon(), new Demon(X,Y,map.getnDemon()+1));
					map.setCell(X,Y,map.getDemon(map.getnDemon()));
					map.setnDemon(map.getnDemon()+1); //mobileElements need to be both
					break;
				case 'Q':
					map.setCell(X,Y,fact.newCristal());
					break;
				case 'Y':
					map.setCell(X,Y,fact.newCloseDoor());
					break;
				case '@':
					map.setLorann(new Player(X,Y));
					map.setCell(X, Y,map.getLorann() );
					break;
				case '+':
					map.setCell(X,Y,fact.newGround());
					break;
				case 'e':
					map.setCell(X,Y,fact.newGround());
					break;
					
				default:
					map.setCell(X,Y,fact.newGround());
					
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
		System.out.println("U died lel");
	}

	
}
