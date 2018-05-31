package model;

import java.io.IOException;

public class Factory {
	
	public CloseDoor newCloseDoor() throws IOException {
		return new CloseDoor();
	}
	
	public YWall newyWall() throws IOException {
		return new YWall();
	}
	
	public XWall newxWall() throws IOException {
		return new XWall();
	}

	public BallWall newballWall() throws IOException {
		return new BallWall();
	}
	
	
	public OpenDoor newOpenDoor()  throws IOException {
	
			return new OpenDoor();
		
		}
	
	public Cristal newCristal() throws IOException {
		return new Cristal();
	}
	public Gold newGold() throws IOException {
		return new Gold();
	}
	public Grave newGrave() throws IOException {
		return new Grave();
	}
	public Ground newGround() throws IOException {
		return new Ground();
	}
}
