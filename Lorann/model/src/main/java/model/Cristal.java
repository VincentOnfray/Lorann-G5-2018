package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cristal extends Object{
	private boolean deadly = false;
	public Cristal() throws IOException {
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/crystal_ball.png")),false);
	}
}
