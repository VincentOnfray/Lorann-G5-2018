package view;

import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame {

private static Panel panel = new Panel();
	
  public Frame(){                

    this.setTitle("Lorann G5 TM");

    this.setSize(646, 413);

    this.setLocationRelativeTo(null);               

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setResizable(false);
    
  	this.setContentPane(panel);
    
    this.setVisible(true);
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
  //Méthods
  
  public static void afficher(int x, int y, String sprite) {

	  	String lien = sprite;
	    panel.setX(x*32);
	    panel.setY(y*32);
	 
	    panel.sprite = lien; 
	    panel.repaint();
	    }   
}