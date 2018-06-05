package view;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import view.Panel;
import model.Element;
import model.Ground;

public class PanelTest {

	@Test
	public void test() {
		Element[][] map = new Element[20][13];
		 for(int x = 0; x < 20; x++) {
		        for(int y = 0; y< 13; y++) {
		        	try {
						map[x][y] = new Ground();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
		Panel panel = new Panel( map);
		
		assertNotNull("panel non null", panel);
	}

}
