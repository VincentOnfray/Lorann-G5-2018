package model;

import java.awt.Image;

public class MobileElement extends Element{
	private int X;
	private int Y;
	
	public MobileElement(){
		
	}
	public void setX(int X) {
		this.X = X;
	}
	public void setY(int Y) {
		this.Y = Y;
	}
	
	public int getX() {
		return this.X;
	}
	
	public int getY() {
		return this.Y;
	}
	
	
	public MobileElement(Image sprite, boolean blocking, int X, int Y) {
		super(sprite, blocking);
		this.X = X;
		this.Y = Y;
	}
	
}
