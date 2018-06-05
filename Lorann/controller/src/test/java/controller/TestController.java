package controller;

import org.junit.Test;

import model.Factory;
import model.Map;

import static org.junit.Assert.assertNotNull;

public class TestController {
	
	

	@Test
	   public void testcreateMap() {
		Controller cont = new Controller();
		cont.setMap(new Map());
		cont.setFact(new Factory());
	    String test= "O------O---O-------O;Ie1eeeQIe1eIe1eeeeeI;IeeDe1eIeeeeeeeDeeeI;IeeeeeeIeeeIeeeeee1I;Ie1e---OeeeOe------I;Ieee1eeee@eeeeeeeeeI;Ie--O--O-e-O--O-ee-I;IeeeeeeeeeeIeeeeeeeI;Ieee1eeOeeeOeeeYeeeI;IeeeeeeIeeeeeeeeee1I;IeeDeeeIeeeIeeeDeeeI;Ieeee1eIe1eIe1eeeeeI;O------O---O-------O;";
	    assertNotNull(cont.createMap(test));
	}
	
	
}


