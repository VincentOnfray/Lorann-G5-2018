package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class BallWall extends Obstacle{
	public BallWall() throws IOException {
		
		super(ImageIO.read(BallWall.class.getClass().getResource("/picture/bone.png").openStream()));
		
	}
}
