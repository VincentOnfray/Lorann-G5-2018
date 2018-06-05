package controller;

import org.junit.Test;

import model.Map;

import static org.junit.Assert.assertEquals;

public class TestJunit {

	int score = 0;
	private Map map;
	LorannController testC = new LorannController(map);
	
	@Test
	   public void testgetScore() {
	      assertEquals(score,testC.getScore());
	   }
}
