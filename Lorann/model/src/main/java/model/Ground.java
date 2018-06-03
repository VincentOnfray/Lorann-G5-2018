package model;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground extends Object{
	
	public Ground() throws IOException {
		super(ImageIO.read(Ground.class.getClass().getResource("/picture/void.png").openStream()));
	}
}
