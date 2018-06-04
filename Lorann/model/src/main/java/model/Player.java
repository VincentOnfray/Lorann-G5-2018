package model;


import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Player is the character controlled by the user
 * @author blenn
 *
 */
public class Player extends MobileElement{
	public Player(int X, int Y) throws IOException {
		super(ImageIO.read(Player.class.getClass().getResource("/picture/lorann_u.png").openStream()),false,X,Y);
	}
}
