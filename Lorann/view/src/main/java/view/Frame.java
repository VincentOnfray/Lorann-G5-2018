package view;

import javax.swing.JFrame;


public class Frame extends JFrame {
		
	Panel panel;
	
		  public Frame(){

			    this.setTitle("Lorann G5");

			    this.setSize(640, 416);

			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			    this.setLocationRelativeTo(null);
			    
			    this.setResizable(false);

			    this.setVisible(true); 
			    
			    panel = new Panel();
			    
			    this.setContentPane(panel);
		  }
}			  
