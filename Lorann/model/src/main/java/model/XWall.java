package model;


import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * A variety of walls
 * @author blenn
 *
 */
public class XWall extends Obstacle{
	public XWall() throws IOException {
		super(ImageIO.read(XWall.class.getClass().getResource("/picture/horizontal_bone.png").openStream()));
	}

}
