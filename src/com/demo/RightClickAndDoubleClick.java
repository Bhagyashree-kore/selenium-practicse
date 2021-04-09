package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.id("")));
		driver.findElement(By.xpath("")).click();
		driver.switchTo().alert().accept();
		
		action.doubleClick(driver.findElement(By.id("")));
		

	}

}
