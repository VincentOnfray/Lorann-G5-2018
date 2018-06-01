package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class XWall extends Obstacle{
	public XWall() throws IOException {
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/horizontal_bone.png")));
	}

}
