package view;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Element;

public class Panel extends JPanel {

    JLabel[][] labels;
    private Element[][] map;
   
    
    public Panel(Element[][] map) {
    	
    	this.map = map;
        this.setLayout(new GridBagLayout());
       

    }

    public void setMap(Element[][] map) {
    	this.map = map;
    }








public void paintComponent(Graphics g) {
	
	    for(int x = 0; x < 20; x++) {
	        for(int y = 0; y< 13; y++) {
	        	
	           
	        	g.drawImage(this.map[x][y].getSprite(), x*32, y*32, null);
	        }
	    }
	   
	}}

	//
	



