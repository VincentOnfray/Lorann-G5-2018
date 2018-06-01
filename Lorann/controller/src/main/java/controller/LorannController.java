package controller;

import java.io.IOException;

import javax.imageio.ImageIO;

import model.CloseDoor;
import model.Cristal;
import model.Demon;
import model.Gold;
import model.Ground;
import model.Map;
import model.OpenDoor;
import model.Player;
import view.Frame;

public class LorannController {
	private Map map;
	private Boolean out;
	private int score;
	
	public LorannController(Map map) {
		this.map = map;
		this.out = false;
		this.score=0;
		//Démarrer le Thread et écouter?
		
	}
	
	public void attemptMoveUp() {
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_u.png").openStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(map.getLorann().getY()>0) {
			if(!map.getCell(map.getLorann().getX(),map.getLorann().getY()-1).getBlocking()) {
				
				
				
				
				
				if(map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof OpenDoor) {
					
					this.exit();
					
					
				}else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof Cristal) {
					this.unlock();
					
					}
				else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof Gold) {
					
					
					this.score = this.score+100;
					
					}
				this.moveUp();
				} else if ((map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof Demon)){this.score = this.score+100;}
			}else {}
	}
	
	public void attemptMoveDown() {
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_b.png").openStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(map.getLorann().getY()<12) {
			if(!map.getCell(map.getLorann().getX(),map.getLorann().getY()+1).getBlocking()) { //Check if movement is possible (not blocking)
				
			
				
				
				
				if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof OpenDoor) { //check if the target is the exit
					
					this.exit();
					
				}else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Cristal) { //Check if the target is the Crystal
					this.unlock();
					
					
					}
				else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Gold) { //Check if the target  is a gold Purse (Does nothing right now)
					
					
					this.score = this.score+100;
					
					}
				this.moveDown();
				}else if ((map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Demon)){this.score = this.score+100;}
			}else {}
		
	}
	
	
	public void attemptMoveLeft() {
		
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_l.png").openStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(map.getLorann().getX()>0) {
			if(!map.getCell(map.getLorann().getX()-1,map.getLorann().getY()).getBlocking()) {
				
				
				
				
				
				if(map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof OpenDoor) {
					
					this.exit();
					
				}else if(map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof Cristal) {
					this.unlock();
					
					
					}
				else if(map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof Gold) {
					
					
					this.score = this.score+100;
					
					}
				this.moveLeft();
				}else if ((map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof Demon)){this.score = this.score+100;}
			}else {}
		
	}
	public void attemptMoveRight() {
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_r.png").openStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(map.getLorann().getX()<19) {
			if(!map.getCell(map.getLorann().getX()+1,map.getLorann().getY()).getBlocking()) {
				
				
				
				
				
				if(map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof OpenDoor) {
					
					this.exit();
					
				}else if(map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof Cristal) {
					this.unlock();
					
					
					}
				else if(map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof Gold) {
					
					
					this.score = this.score+100;
					
					}
				this.moveRight();
				}else if ((map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof Demon)){this.score = this.score+100;}
			}else {}
		
	}
	


	public void exit() { //TO DO
		
		
		this.out = true;
	}
	
	
	private void moveDown() { //Y+1 moves Lorann down
		map.setCell(map.getLorann().getX(),map.getLorann().getY()+1, map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setY(map.getLorann().getY()+1);
	}
	
	private void moveLeft() { //X-1 moves lorann left 
		map.setCell(map.getLorann().getX()-1,map.getLorann().getY(), map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setX(map.getLorann().getX()-1);
	}
	
	private void moveRight(){ //X+1 moves Lorann Right
		map.setCell(map.getLorann().getX()+1,map.getLorann().getY(), map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setX(map.getLorann().getX()+1);
	}

	private void moveUp() { //Y-1 moves Lorann Up
		map.setCell(map.getLorann().getX(),map.getLorann().getY()-1, map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setY(map.getLorann().getY()-1);
	}
	
	
	
	
	
	
	
	
	
	
	
private void unlock() {
	for(int X = 0; X < 20; X++) {
		
        for(int Y = 0; Y< 13; Y++) {
        	
        	if (map.getCell(X, Y) instanceof CloseDoor) {
        		try {
					map.setCell(X, Y, new OpenDoor());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        	
        	else {}
           
        	
        }
    }
}

public Boolean getOut() {
	return this.out;
	
}

public int getScore() {
	return this.score;
}
}
