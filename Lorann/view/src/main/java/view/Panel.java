package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	String sprite;
	int x;
	int y;

	
	public void paintComponent(Graphics g){
		    try {
		
		      Image img = ImageIO.read(new File(sprite));
		
		      g.drawImage(img, x, y, this);
		
		    } catch (IOException e) {
		    
		      e.printStackTrace();
	}
  }

public void setY(int y) {
	// TODO Auto-generated method stub
	this.y = y;
}

public void setX(int x) {
	// TODO Auto-generated method stub
	this.x =x;
	}
}
