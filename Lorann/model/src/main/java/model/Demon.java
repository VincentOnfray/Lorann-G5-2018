package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Demon extends MobileElement{
	public Demon(int X, int Y, int n) throws IOException {
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/monster_"+n+".png")),true,true, X,Y);
	}
}
