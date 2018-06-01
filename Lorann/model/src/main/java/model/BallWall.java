package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class BallWall extends Obstacle{
	public BallWall() throws IOException {
		
		super(ImageIO.read(new File(new File("").getAbsolutePath()+"/sprite/bone.png")));
		System.out.println(new File("").getAbsolutePath());
	}
}
