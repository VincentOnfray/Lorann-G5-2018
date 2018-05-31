package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Element;

public class Panel extends JPanel {
	
	JLabel[][] labels;

	public Panel() {
		labels = new JLabel[20][13];
		this.setLayout(new GridBagLayout());
		
	}
	
public void showMap(Element[][] tab) {
	for(int x = 0; x < 20; x++) {
		for(int y = 0; y< 13; y++) {
			
			GridBagConstraints c = new GridBagConstraints();
			c.gridx = x;
			c.gridy = y;
			
			JLabel label = new JLabel(new ImageIcon(tab[x][y].getSprite()));
			this.add(label, c);
		}
	}
}


}