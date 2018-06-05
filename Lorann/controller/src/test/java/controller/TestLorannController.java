package controller;

import org.junit.Test;
import model.Map;

import static org.junit.Assert.assertEquals;

public class TestLorannController {

	
	
	
	
	@Test
	   public void testgetScore() {

		Map map = null;
		LorannController testC = new LorannController(map);
		
		
	      assertEquals(testC.getScore(), 0);
	   }
}
