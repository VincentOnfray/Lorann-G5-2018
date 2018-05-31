package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Gold extends Object{
	private boolean deadly = false;
	public Gold() throws IOException {
		super(ImageIO.read(new File("C:/Users/blenn/Desktop/eXia/UE5/Projet/Lorann-G5-2018/Lorann/view/sprite/purse.png")),false);
	}
}
