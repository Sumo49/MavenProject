package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar {
	@Test
	public void Bbc() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		driver.close();
			
			
	}

}
