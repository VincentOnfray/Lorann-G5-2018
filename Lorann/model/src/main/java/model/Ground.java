package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground extends Object{
	
	public Ground() throws IOException {
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/void.png")),false);
	}
}
