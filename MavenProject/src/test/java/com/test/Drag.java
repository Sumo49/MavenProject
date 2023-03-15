package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {
	
	@Test
	public void DragDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		//Thread.sleep(2000);
		driver.close();
	}

}
