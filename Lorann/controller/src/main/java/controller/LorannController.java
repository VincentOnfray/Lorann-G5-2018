package controller;

import java.io.IOException;

import model.CloseDoor;
import model.Cristal;
import model.Gold;
import model.Ground;
import model.Map;
import model.OpenDoor;
import view.Frame;

public class LorannController {
	private Map map;
	private Frame frame;
	
	
	public LorannController(Map map, Frame frame) {
		this.map = map;
		this.frame= frame;
		
		//Démarrer le Thread et écouter?
		
	}
	
	public void attemptMoveUp() {
		
		if(map.getLorann().getY()>0) {
			if(!map.getCell(map.getLorann().getX(),map.getLorann().getY()-1).getBlocking()) {
				
				this.moveUp();
				
				
				
				if(map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof OpenDoor) {
					
					this.won();
					
				}else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof Cristal) {
					this.unlock();
					
					}
				else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()-1) instanceof Gold) {
					
					
					
					
					}
				}
			}else {}
	}
	
	public void attemptMoveDown() {
		if(map.getLorann().getY()<12) {
			if(!map.getCell(map.getLorann().getX(),map.getLorann().getY()+1).getBlocking()) { //Check if movement is possible (not blocking)
				
				this.moveDown();
				
				
				
				if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof OpenDoor) { //check if the target is the exit
					
					this.won();
					
				}else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Cristal) { //Check if the target is the Crystal
					this.unlock();
					
					
					}
				else if(map.getCell(map.getLorann().getX(),map.getLorann().getY()+1) instanceof Gold) { //Check if the target  is a gold Purse (Does nothing right now)
					
					
					
					
					}
				}
			}else {}
		
	}
	
	
	public void attemptMoveLeft() {
		if(map.getLorann().getX()>0) {
			if(!map.getCell(map.getLorann().getX()-1,map.getLorann().getY()).getBlocking()) {
				
				this.moveLeft();
				
				
				
				if(map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof OpenDoor) {
					
					this.won();
					
				}else if(map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof Cristal) {
					this.unlock();
					
					
					}
				else if(map.getCell(map.getLorann().getX()-1,map.getLorann().getY()) instanceof Gold) {
					
					
					
					
					}
				}
			}else {}
		
	}
	public void attemptMoveRight() {
		if(map.getLorann().getX()<19) {
			if(!map.getCell(map.getLorann().getX()+1,map.getLorann().getY()).getBlocking()) {
				
				this.moveRight();
				
				
				
				if(map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof OpenDoor) {
					
					this.won();
					
				}else if(map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof Cristal) {
					this.unlock();
					
					
					}
				else if(map.getCell(map.getLorann().getX()+1,map.getLorann().getY()) instanceof Gold) {
					
					
					
					
					}
				}
			}else {}
		
	}
	


	public void won() { //TO DO
		
		System.out.println("Noice");
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




}
