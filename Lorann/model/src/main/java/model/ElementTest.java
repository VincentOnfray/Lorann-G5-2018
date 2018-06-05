package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElementTest {

	@Test
	public void element() {
	
		Element element = new Element(null,true);
		assertTrue(element.getBlocking());
	}

}
