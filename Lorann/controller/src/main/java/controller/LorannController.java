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

/**
 * controller dedicated to the Player Element
 * @author blenn
 *
 */
public class LorannController {
	private Map map;
	private Boolean out;
	private int score;
	/**
	 * Initializes a new LorannController
	 * @param map
	 */
	public LorannController(Map map) {
		this.map = map;
		this.out = false;
		this.score=0;		
	}
	/**
	 * Checks if moving up is possible for lorann, as well as what consequence it has
	 */
	public void attemptMoveUp() {
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_u.png").openStream()));
		} catch (IOException e) {			
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
					
					this.pickUpPurse();
					}
				this.moveUp();
				} else if ((map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof Demon)){
					
					this.hug();
				}
			}else {}
	}
	/**
	 * Checks if moving down is possible for lorann, as well as what consequence it has
	 */
	public void attemptMoveDown() {
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_b.png").openStream()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		if(map.getLorann().getY()<12) {
			if(!map.getCell(map.getLorann().getX(),map.getLorann().getY()+1).getBlocking()) { //Check if movement is possible (not blocking)
				
			
				
				
				
				if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof OpenDoor) { //Check if the target is the exit
					
					this.exit();
					
				}else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Cristal) { //Check if the target is the Crystal
					this.unlock();
					
					
					}
				else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Gold) { //Check if the target  is a gold Purse (Does nothing right now)
					
					
					this.pickUpPurse();
					}
				this.moveDown();
				}else if ((map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Demon)){
					this.hug();
				}
			}else {}
		
	}
	/**
	 * Checks if moving left is possible for lorann, as well as what consequence it has
	 */	
	public void attemptMoveLeft() {
		
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_l.png").openStream()));
		} catch (IOException e) {
		
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
					
					
					this.pickUpPurse();
					}
				this.moveLeft();
				}else if ((map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof Demon)){
					this.hug();
				}
			}else {}
		
		
		
	}
	/**
	 * Checks if moving right is possible for lorann, as well as what consequence it has
	 */
	public void attemptMoveRight() {
		try {
			map.getLorann().setSprite(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_r.png").openStream()));
		} catch (IOException e) {
		
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
					
					
					this.pickUpPurse();
					
					}
				this.moveRight();
				}else if ((map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof Demon)){
					
				}
			}else {}
		
	}
	/**
	 * triggered when Lorann gets to the open gate
	 */
	public void exit() { 				
		this.out = true;
	}
	/**
	 * Moves Lorann down
	 */
	private void moveDown() { //Y+1 moves Lorann down
		map.setCell(map.getLorann().getX(),map.getLorann().getY()+1, map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setY(map.getLorann().getY()+1);
	}
	/**
	 * Moves Lorann left
	 */
	private void moveLeft() { //X-1 moves lorann left 
		map.setCell(map.getLorann().getX()-1,map.getLorann().getY(), map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setX(map.getLorann().getX()-1);
	}
	/**
	 * Moves Lorann right
	 */
	private void moveRight(){ //X+1 moves Lorann Right
		map.setCell(map.getLorann().getX()+1,map.getLorann().getY(), map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setX(map.getLorann().getX()+1);
	}
	/**
	 * Moves Lorann up
	 */
	private void moveUp() { //Y-1 moves Lorann Up
		map.setCell(map.getLorann().getX(),map.getLorann().getY()-1, map.getLorann());
		try {
				map.setCell(map.getLorann().getX(),map.getLorann().getY(), new Ground());
		} catch (IOException e) {

		e.printStackTrace();
		}
			map.getLorann().setY(map.getLorann().getY()-1);
	}
	/**
	 * triggered when lorann picks up the crystal
	 * opens the door
	 */	
	private void unlock() {
	for(int X = 0; X < 20; X++) {
		
        for(int Y = 0; Y< 13; Y++) {
        	
        	if (map.getCell(X, Y) instanceof CloseDoor) {
        		try {
					map.setCell(X, Y, new OpenDoor());
				} catch (IOException e) {
			
					e.printStackTrace();
				}
        	}
        	
        	else {}
           
        	
        }
    }
}
	/**
	 * returns if Lorann has escaped or not
	 */
	public Boolean getOut() {
	return this.out;
	
}
	/**
	 * returns the level's score
	 */
	public int getScore() {
	return this.score;
}
	/**
	 *Triggers when Lorann is already next to a demon and moves towards it, adds 150 to the score
	 */
	public void hug() {
	this.score = this.score+150;
	System.out.println("Huggy one +150   ("+this.score+")");
}
	/**
	 * Triggers when Lorann picks a purse up, adds 100 to the score
	 */
	public void pickUpPurse() {
	this.score = this.score+100;
	System.out.println("Picked up a purse +100 ("+this.score+")");
}

}
