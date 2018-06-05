package model;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void Factory() throws IOException {
		Demon kery = new Demon(2,14,1);
		assertNotNull(kery.getX());
		
	}

}
