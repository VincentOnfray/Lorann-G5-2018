package model;

import java.awt.Image;
/**
 * All objects in a level are Elements
 * @author blenn
 *
 */
public class Element {
	
	private Image sprite;
	
	private boolean blocking;
	
	public Element(Image sprite, boolean blocking) {
		this.setSprite(sprite);
		this.setBlocking(blocking);
		
	}
			
	public Element() {
		
	}
	
	/**
	 * 
	 * @return if the element is blocking or not
	 */
	public boolean getBlocking() {
		return blocking;
	}
	
	/**
	 * sets if the element is blocking or not
	 * @param blocking
	 */
	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}
	
	
	/**
	 * returns the image of the element
	 * @return
	 */
	public Image getSprite() {
		return sprite;
	}
	
	/**
	 * sets the Element's sprite
	 * @param sprite
	 */
	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	
	
	
}

