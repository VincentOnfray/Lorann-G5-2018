package view;

import static org.junit.Assert.*;
import view.Console;
import org.junit.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.*;
public class ConsoleTest {

	@Test
	
	public void test() throws AWTException {
		
		Console console = new Console();
		Robot robot = new Robot();
	
		robot.keyPress(KeyEvent.VK_NUMPAD1);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		assertNotNull(console.whatMap());
		
	
	}
}

