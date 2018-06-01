package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class YWall extends Obstacle{
	public YWall() throws IOException {
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/vertical_bone.png")));
	}
}
