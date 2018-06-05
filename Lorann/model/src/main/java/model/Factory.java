package model;

import java.io.IOException;

public class Factory {
	/**
	 * creates a new CloseDoor
	 * @return
	 * @throws IOException
	 */
	public CloseDoor newCloseDoor() throws IOException {
		return new CloseDoor();
	}
	/**
	 * creates a new yWall
	 * @return
	 * @throws IOException
	 */
	public YWall newyWall() throws IOException {
		return new YWall();
	}
	/**
	 * creates a new xWall
	 * @return
	 * @throws IOException
	 */
	public XWall newxWall() throws IOException {
		return new XWall();
	}
	/**
	 * creates a new ballWall
	 * @return
	 * @throws IOException
	 */
	public BallWall newballWall() throws IOException {
		return new BallWall();
	}
	/**
	 * creates a new OpenDoor
	 * @return
	 * @throws IOException
	 */	
	public OpenDoor newOpenDoor()  throws IOException {
		return new OpenDoor();
		
		}
	/**
	 * creates a new Cristal
	 * @return
	 * @throws IOException
	 */
	public Cristal newCristal() throws IOException {
		return new Cristal();
	}
	/**
	 * creates a new Gold
	 * @return
	 * @throws IOException
	 */
	public Gold newGold() throws IOException {
		return new Gold();
	}
	/**
	 * creates a new Ground
	 * @return
	 * @throws IOException
	 */	
	public Ground newGround() throws IOException {
		return new Ground();
	}
	/**
	 * Creates a new demon
	 * @param X
	 * @param Y
	 * @param n  n is used to determine which sprite to allocate to the Demon
	 * @return
	 * @throws IOException
	 */
	public Demon newDemon(int X, int Y, int n) throws IOException{
		return new Demon(X,Y,n);
	}
	/**
	 * creates a new Player Element
	 * @param X
	 * @param Y
	 * @return
	 * @throws IOException
	 */
	public Player newPlayer(int X, int Y) throws IOException{
		return new Player(X,Y);
	}
}
