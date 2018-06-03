package model;


import java.io.IOException;

import javax.imageio.ImageIO;

public class YWall extends Obstacle{
	public YWall() throws IOException {
		super(ImageIO.read(YWall.class.getClass().getResource("/picture/vertical_bone.png").openStream()));
	}
}
