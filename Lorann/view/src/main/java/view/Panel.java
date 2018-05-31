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
    Element[][] map;
   
    
    public Panel(Element[][] map) {
    	this.map = map;
    
        labels = new JLabel[20][13];
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.green);

    }

public void showMap(Element[][] tab) {
    for(int x = 0; x < 20; x++) {
        for(int y = 0; y< 13; y++) {
        	
            //GridBagConstraints c = new GridBagConstraints();
            //c.gridx = x;
            //c.gridy = y;

            //JLabel label = new JLabel();
			/*label = new JLabel(new ImageIcon(tab[x][y].getSprite()));
			System.out.println(tab[x][y].getClass());
            this.add(label, c);*/
            //this.add(new JLabel("test"), c);
        	
        }
    }
    this.setVisible(true);
}


public void paintComponent(Graphics g) {
	
	    for(int x = 0; x < 20; x++) {
	        for(int y = 0; y< 13; y++) {
	        	
	           
	        	g.drawImage(this.map[x][y].getSprite(), x*32, y*32, null);
	        }
	    }
	   
	}}

	//
	



