package model;


import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends MobileElement{
	public Player(int X, int Y) throws IOException {
		super(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_u.png").openStream()),false,X,Y);
	}
}
