package model;

public class Factory {
	public CloseDoor newCloseDoor() {
		return new CloseDoor();
	}
	public yWall newyWall() {
		return new yWall();
	}
	public xWall newxWall() {
		return new xWall();
	}
	public ballWall newballWall() {
		return new ballWall();
	}
	public Player newPlayer() {
		return new Player();
	}
	public Demon newDemon() {
		return new Demon();
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
