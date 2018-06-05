package model;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class MapTest {

	@Test
	public void test() throws IOException {
		
		Player lorann = new Player(8,5);
		assertTrue(lorann instanceof Player);
		
	}

}
