package model;

import java.awt.Image;

public class Element {
	private Image sprite;
	private boolean blocking;
	
	public Element(Image sprite, boolean blocking) {
		this.setSprite(sprite);
		this.setBlocking(blocking);
		
	}
	public Element() {
		
	}
	public boolean getBlocking() {
		return blocking;
	}
	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}
	public Image getSprite() {
		return sprite;
	}
	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	
	
	
}

