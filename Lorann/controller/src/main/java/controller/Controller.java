package controller;


import java.io.IOException;
import java.io.StringReader;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import model.*;
import model.Object;
import model.dao.DAO;
import view.*;




/**
 * This is the main control class
 * @author blenn
 *
 */
public class Controller implements IController{
	
	private boolean finished;
	private Factory fact;
	private LorannController lorannControl;
	private Frame frame;
	private Map map;
	private DAO etienne;
	private String currentLVL;
	private int globalScore;
	
	
	@Override
	public void start() throws SQLException {
		
		this.globalScore = 0;		this.fact = new Factory();
		this.currentLVL=this.chooseMap(); 
		this.play(currentLVL); //allows to choose map and start the game loop
		
	}
	
	@Override
	public String chooseMap() { 
	
		Console menu = new Console(); 
		
		return menu.whatMap();
	}
		
	@Override
	public void play(String mapchoice) throws SQLException{
		
		this.finished = false;
		this.etienne = new DAO();
		this.map = this.createMap(etienne.readMap(mapchoice));
		this.frame = new Frame(map.getGrid());
		this.lorannControl = new LorannController(map);

		
		
		while (!this.finished) {
			this.loop();
			
								}
		
		
		}
	
	@Override
	public void display() {
		
		this.frame.getPanel().repaint();
		
		
		
	}
	
	@Override 
	public void loop() {
		this.display();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		this.updateModel();
		
	}
			
	@Override
	public boolean checkAI(Demon demon, int i) {
		
		boolean possible = false;
		
		
		switch (i) {
		case 1: //Y-1 Up
			if(demon.getY()>0) {
				if(!this.map.getCell(demon.getX(),demon.getY()-1).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX() && this.map.getLorann().getY()== demon.getY()-1) {
						this.finished=true;
						this.lost();
					}else if(this.map.getCell(demon.getX(),demon.getY()-1) instanceof Object && !(this.map.getCell(demon.getX(),demon.getY()-1) instanceof Ground)) { //Forbids the AI to erase objects such as Purses, openDoors or crystals
						
							possible= false;
						}
					}
				}else {}
			break;
			
			
		case 2: //Y+1 Down
			
			if(demon.getY()<12) {
				if(!this.map.getCell(demon.getX(),demon.getY()+1).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX() && this.map.getLorann().getY()== demon.getY()+1) {
						this.lost();
						this.finished=true;
								}else if(this.map.getCell(demon.getX(),demon.getY()+1) instanceof Object && !(this.map.getCell(demon.getX(),demon.getY()+1) instanceof Ground)) {
									possible= false;
						}
					}
				}else {}
			break;
			
			
			
			
		case 3: //X-1 left
			if(demon.getX()>0) {
				if(!this.map.getCell(demon.getX()-1,demon.getY()).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX()-1 && this.map.getLorann().getY()== demon.getY()) {
						this.lost();
						this.finished=true;
							}else if(this.map.getCell(demon.getX()-1,demon.getY()) instanceof Object && !(this.map.getCell(demon.getX()-1,demon.getY()) instanceof Ground)) {
								possible= false;
						}
					}
				}else {}
			break;
			
			
			
			
		case 4: //X+1 right
			if(demon.getX()<19) {
				if(!this.map.getCell(demon.getX()+1,demon.getY()).getBlocking()) {
					possible = true;
					if(this.map.getLorann().getX() == demon.getX()+1 && this.map.getLorann().getY()== demon.getY()) {
						this.lost();
						this.finished=true;
							}else if(this.map.getCell(demon.getX()+1,demon.getY())  instanceof Object && !(this.map.getCell(demon.getX()+1,demon.getY()) instanceof Ground)) {
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
	public void updateModel() {
		int n = map.getnDemon()-1; //Demonlist's 1st demon is number 0, not 1
		this.checkMovement();
		for(int i = 0; i <= n; i++) { 
			
			double r = (Math.random()*10)%5; //generate a random movement
			
			switch ((int)r) {
			case 1: //moveUp (Y-1)
				
				
				if (this.checkAI(map.getDemon(i), 1)){
					try {
						map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					} catch (IOException e) {
					
						e.printStackTrace();
					}
					map.getDemon(i).setY(map.getDemon(i).getY()-1);
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));
				}
				else {
					
				}
				
				break;
			case 2: //moveDown (Y+1)
				
				if (this.checkAI(map.getDemon(i), 2 )){
				try {
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				map.getDemon(i).setY(this.map.getDemon(i).getY()+1);
				map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));}
				
				else {
					
				}
				break;
			case 3: //move Left (X-1)
				
				if (this.checkAI(this.map.getDemon(i), 3 )){
					try {
						map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					map.getDemon(i).setX(map.getDemon(i).getX()-1);
					map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), map.getDemon(i));}
					
					else {
						
					}
				break;
				
			case 4:    //move right (X+1)

				if (this.checkAI(map.getDemon(i), 4 )){
					try {
						map.setCell(map.getDemon(i).getX(),map.getDemon(i).getY(), new Ground());
					} catch (IOException e) {
						
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
	public Map createMap(String mapString) {  
		
		 this.map = new Map();
		map.setnDemon(0);
		StringReader sr = new StringReader(mapString);
		for(int Y = 0; Y<13; Y++ ) { 
			
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
					map.setDemon(map.getnDemon(), fact.newDemon(X,Y,map.getnDemon()+1));
					map.setCell(X,Y,map.getDemon(map.getnDemon()));
					map.setnDemon(map.getnDemon()+1);
					break;
				case 'Q':
					map.setCell(X,Y,fact.newCristal());
					break;
				case 'Y':
					map.setCell(X,Y,fact.newCloseDoor());
					break;
				case '@':					
					map.setLorann(fact.newPlayer(X, Y));
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
	
				e.printStackTrace();
			}
	}
		}
		
		return map;
	}
	
	@Override
	public void checkMovement(){
		switch (frame.getLast()) {
		case UP:
			this.lorannControl.attemptMoveUp();
			break;
		case DOWN:
			this.lorannControl.attemptMoveDown();
			break;
		case LEFT:
			this.lorannControl.attemptMoveLeft();
			break;
		case RIGHT:
			this.lorannControl.attemptMoveRight();
			break;
			default:
			try {
				map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_u.png").openStream()));
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		if(this.lorannControl.getOut()) {
			this.finished = true;
			this.won();
		}
		else {		}
		this.frame.setLast(LastOrder.IDLE);
	}
	
	
	@Override
	public void won() {
		this. globalScore = this. globalScore +  (this.lorannControl.getScore()*2);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		switch (this.currentLVL){
			case "1":
				this.frame.dispose();
			try {
				this.currentLVL = "2";
				this.play(this.currentLVL);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
				break;
			case "2":
				this.frame.dispose();
				try {
					this.currentLVL = "3";
					this.play(this.currentLVL);
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
					break;
			case "3":
				this.frame.dispose();
				try {
					this.currentLVL = "4";
					this.play(this.currentLVL);
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
					break;
			case "4":
				this.frame.dispose();
				try {
					this.currentLVL = "5";
					this.play(this.currentLVL);
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
					break;
			case "5":
				
				System.out.println("Your Total Score: \n"+this.lorannControl.getScore()*2);
				try {
					this.map = this.createMap(etienne.readMap("7"));
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				this.frame.getPanel().setMap(this.map.getGrid());
				this.frame.getPanel().repaint();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
					
			}
				this.frame.dispose();
				System.out.println("the end\nYour score:\n"+this.globalScore);
				System.exit(0);
				break;
					default:
						


			
		}
		
		
		
		}
				
	@Override
	public void lost() {
		this. globalScore = this. globalScore +  this.lorannControl.getScore();
		System.out.println("Your Total Score : \n"+this.globalScore+"\nStill Lost though");
		try {			
			this.map = this.createMap(etienne.readMap("6"));
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		this.frame.getPanel().setMap(this.map.getGrid());
		this.frame.getPanel().repaint();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.frame.dispose();
		System.exit(0);
	}

	public int getGlobalScore() {
		return globalScore;
	}

	public void setGlobalScore(int globalScore) {
		this.globalScore = globalScore;
	}

	
}
