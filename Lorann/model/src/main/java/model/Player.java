package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends MobileElement{
	public Player(int X, int Y) throws IOException {
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/lorann_r.png")),false,false,X,Y);
	}
}
