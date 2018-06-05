package view;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import model.Element;
import model.*;
public class FrameTest {

	@Test
	public void test() {
		Element[][] elem = new Element[20][13];
		 for(int x = 0; x < 20; x++) {
		        for(int y = 0; y< 13; y++) {
		        	try {
						elem[x][y]= new Cristal();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
		Frame test = new Frame(elem);
		assertEquals(LastOrder.IDLE,test.getLast());
	}

}
