package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Demon extends MobileElement{
	public Demon(int X, int Y, int n) throws IOException {
		super(ImageIO.read(new File("C:/Users/blenn/Desktop/eXia/UE5/Projet/Lorann-G5-2018/Lorann/view/sprite/monster_"+n+".png")),true,true, X,Y);
	}
}
