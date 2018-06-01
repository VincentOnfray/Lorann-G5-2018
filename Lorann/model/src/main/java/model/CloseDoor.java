package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CloseDoor extends Obstacle{
	public CloseDoor() throws IOException {
		super(ImageIO.read(CloseDoor.class.getClass().getResource("/picture/gate_closed.png").openStream()));
	}
}
