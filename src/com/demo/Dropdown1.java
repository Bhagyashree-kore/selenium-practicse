package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://wwW.facebook.com");
		 
		WebElement ddown =   driver.findElement(By.id("month"));
		
		Select sel = new Select(ddown);
		
		sel.selectByIndex(3); //not a good habbit bcz in future if we added new dd then it wont create problem
		Thread.sleep(3000);
		
		sel.selectByValue("10");//october keep it in double quote//highly recommend to use this
		Thread.sleep(3000);
		
		sel.selectByVisibleText("January");//select january//most recommemnded one
		
	}

}
