package model;

import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Ground object
 * @author blenn
 *
 */
public class Ground extends Object{
	
	public Ground() throws IOException {
		super(ImageIO.read(Ground.class.getClass().getResource("/picture/void.png").openStream()));
	}
}
