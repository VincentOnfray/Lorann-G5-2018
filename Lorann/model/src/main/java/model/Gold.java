package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Gold extends Object{
	private boolean deadly = false;
	public Gold() throws IOException {
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/purse.png")),false);
	}
}
