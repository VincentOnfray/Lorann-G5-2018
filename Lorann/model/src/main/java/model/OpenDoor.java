package model;


import java.io.IOException;

import javax.imageio.ImageIO;

public class OpenDoor extends Object{

	public OpenDoor() throws IOException {
		super (ImageIO.read(OpenDoor.class.getClass().getResource("/picture/gate_open.png").openStream()));
		
	}
	
}
