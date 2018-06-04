package model;

import java.awt.Image;

public class MobileElement extends Element{
	private int X;
	private int Y;
	
	public MobileElement(){
		
	}
	
	/**
	 * Sets the X coordinate
	 * @param X
	 */
	public void setX(int X) {
		this.X = X;
	}
	/**
	 * sets the Y coordinate
	 * @param Y
	 */
	public void setY(int Y) {
		this.Y = Y;
	}
	/**
	 * returns the X coordinate
	 * @return
	 */
	public int getX() {
		return this.X;
	}
	/**
	 * returns the Y coordinates
	 * @return
	 */
	public int getY() {
		return this.Y;
	}
	
	/**
	 * initializes the mobile Element from coordinates
	 * @param sprite
	 * @param blocking
	 * @param X
	 * @param Y
	 */
	public MobileElement(Image sprite, boolean blocking, int X, int Y) {
		super(sprite, blocking);
		this.X = X;
		this.Y = Y;
	}
	
}
