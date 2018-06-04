package model;


import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Gold, can be picked up, gives +100 score
 * @author blenn
 *
 */
public class Gold extends Object{
	
	public Gold() throws IOException {
		super(ImageIO.read(Gold.class.getClass().getResource("/picture/purse.png").openStream()));
	}
}
