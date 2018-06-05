package controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestController {
	
	int globalScore = 0;

	@Test
	   public void testgetGlobalScore() {
	      assertEquals(globalScore,this.getGlobalScore(globalScore));
	   }
	public int getGlobalScore(int globalScore) {
		return globalScore;
	}
}


