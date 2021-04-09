package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		
	}

}
