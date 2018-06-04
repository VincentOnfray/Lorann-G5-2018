package model;


import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * the crystal needs to be picked up by Lorann to open the gate
 * @author blenn
 *
 */
public class Cristal extends Object{
	
	public Cristal() throws IOException {
		super(ImageIO.read(Cristal.class.getClass().getResource("/picture/Crystal_ball.png").openStream()));
	}
}
