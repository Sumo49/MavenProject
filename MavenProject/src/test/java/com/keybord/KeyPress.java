package com.keybord;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

public class KeyPress {
	@Test
	public void Key() throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
