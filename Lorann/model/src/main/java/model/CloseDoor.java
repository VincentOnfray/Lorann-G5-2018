package model;


import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * ClosedDoor Element
 * @author blenn
 *
 */
public class CloseDoor extends Obstacle{
	public CloseDoor() throws IOException {
		super(ImageIO.read(CloseDoor.class.getClass().getResource("/picture/gate_closed.png").openStream()));
	}
}
