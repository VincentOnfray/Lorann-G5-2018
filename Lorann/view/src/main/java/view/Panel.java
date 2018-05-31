package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	String sprite;
	int X ;
	int Y ;

	
	public void paintComponent(Graphics g){
		    try {
		   
		      Image img = ImageIO.read(new File("crystall_ball.png"));
		
		      g.drawImage(img, X, Y, this);
		
		    } catch (IOException e) {
		    
		      e.printStackTrace();
	}
  }

public void setY(int y) {
	// TODO Auto-generated method stub
	this.X = Y;
}

public void setX(int x) {
	// TODO Auto-generated method stub
	this.X =X;
	}

public Panel() {}

public Panel(int X,int Y) {
	
}

}
