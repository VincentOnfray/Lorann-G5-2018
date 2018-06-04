package model;


import java.io.IOException;

import javax.imageio.ImageIO;

public class Cristal extends Object{
	
	public Cristal() throws IOException {
		super(ImageIO.read(Cristal.class.getClass().getResource("/picture/Crystal_ball.png").openStream()));
	}
}
