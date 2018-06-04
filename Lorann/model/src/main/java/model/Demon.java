package model;


import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Demons are enemy AIs
 * @author blenn
 *
 */
public class Demon extends MobileElement{
	public Demon(int X, int Y, int n) throws IOException {
		super(ImageIO.read(Demon.class.getClass().getResource("/picture/monster_"+n+".png").openStream()),true, X,Y);
	}
}
