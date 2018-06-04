package model;

import java.awt.Image;
/**
 * Objects are Elements built to either be picked up or cause events when reached by the Player
 * @author blenn
 *
 */
public class Object extends Element{
	public Object(Image sprite) {
		super(sprite,false);
	}
	public Object () {
		
	}
}
