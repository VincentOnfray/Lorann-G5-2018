package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cristal extends Object{
	private boolean deadly = false;
	public Cristal() throws IOException {
		super(ImageIO.read(Cristal.class.getClass().getResource("/picture/Crystal_ball.png").openStream()),false);
	}
}
