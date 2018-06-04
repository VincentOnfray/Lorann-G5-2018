package model;


import java.io.IOException;

import javax.imageio.ImageIO;


/**
 * Variety of Wall
 * @author blenn
 *
 */
public class BallWall extends Obstacle{
	public BallWall() throws IOException {
		
		super(ImageIO.read(BallWall.class.getClass().getResource("/picture/bone.png").openStream()));
		
	}
}
