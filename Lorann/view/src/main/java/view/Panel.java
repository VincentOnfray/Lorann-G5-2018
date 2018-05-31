package view;

<<<<<<< HEAD
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
=======
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
>>>>>>> 02f6ea900517dbd63a5de69a2f3f37e5efcf0e19
import javax.swing.JPanel;
import model.Element;

public class Panel extends JPanel {
	
<<<<<<< HEAD
	JLabel[][] labels;

	public Panel() {
		labels = new JLabel[20][13];
		this.setLayout(new GridBagLayout());
=======
	String sprite;
	int X ;
	int Y ;

	
	public void paintComponent(Graphics g){
		    try {
		   
		      Image img = ImageIO.read(new File("crystall_ball.png"));
		
		      g.drawImage(img, X, Y, this);
>>>>>>> 02f6ea900517dbd63a5de69a2f3f37e5efcf0e19
		
	}
<<<<<<< HEAD
	
public void showMap(Element[][] tab) {
	for(int x = 0; x < 20; x++) {
		for(int y = 0; y< 13; y++) {
			
			GridBagConstraints c = new GridBagConstraints();
			c.gridx = x;
			c.gridy = y;
			
			JLabel label = new JLabel(new ImageIcon(tab[x][y].getSprite()));
			this.add(label, c);
		}
=======
  }

public void setY(int y) {
	// TODO Auto-generated method stub
	this.X = Y;
}

public void setX(int x) {
	// TODO Auto-generated method stub
	this.X =X;
>>>>>>> 02f6ea900517dbd63a5de69a2f3f37e5efcf0e19
	}

public Panel() {}

public Panel(int X,int Y) {
	
}

}


}