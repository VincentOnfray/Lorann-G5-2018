package model;

public class Factory {
	
	public CloseDoor newCloseDoor() {
		return new CloseDoor();
	}
	
	public YWall newyWall() {
		return new YWall();
	}
	
	public XWall newxWall() {
		return new XWall();
	}
	
	public BallWall newballWall() {
		return new BallWall();
	}
	
	
	public OpenDoor newOpenDoor() {
		return new OpenDoor();
	}
	public Cristal newCristal() {
		return new Cristal();
	}
	public Gold newGold() {
		return new Gold();
	}
	public Grave newGrave() {
		return new Grave();
	}
	public Ground newGroung() {
		return new Ground();
	}
}
