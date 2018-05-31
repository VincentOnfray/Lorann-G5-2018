package view;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Element;

import javax.swing.JFrame;


public class Frame extends JFrame {
	   
		private Panel panel;

          public Frame(Element[][] map){
        	  	
        	  	this.panel = new Panel(map);
        	  	this.toFront();
        	  	this.panel.setFocusable(true);
        	  
                this.setTitle("Lorann G5");

                this.setSize(640, 416);

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                this.setLocationRelativeTo(null);

                this.setResizable(false);

                this.setVisible(true);
                
                this.setContentPane(panel);

          }
          
          public Panel getPanel() {
			return this.panel;
        	  
          }
          public void setPanel(Panel panel) {
        	  this.panel = panel;
          }
}