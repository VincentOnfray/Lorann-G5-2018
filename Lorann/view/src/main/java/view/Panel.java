package view;

import java.awt.Graphics;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import model.Element;
/**
 * The UI's Content
 * @author blenn
 *
 */
public class Panel extends JPanel {

    
	private static final long serialVersionUID = 1L;	
    private Element[][] map;   
    
    public Panel(Element[][] map) {
    	this.map = map;
        this.setLayout(new GridBagLayout());
    }
    /**
	 * Sets the map to print on the panel
	 */
    public void setMap(Element[][] map) {
    	this.map = map;
    }

    /**
     * paints the map currently bound to the panel
     */
public void paintComponent(Graphics g) {
	    for(int x = 0; x < 20; x++) {
	        for(int y = 0; y< 13; y++) {
	        	g.drawImage(this.map[x][y].getSprite(), x*32, y*32, null);
	        }
	    }
	   
	}
}