package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://wwW.facebook.com");
		 
		WebElement ddown =   driver.findElement(By.id("month"));
		Select sel = new Select(ddown);
		
		WebElement selectedValue = sel.getFirstSelectedOption();//return selected value 
		System.out.println(selectedValue.getText());
		
		sel.selectByVisibleText("January");//select january//most recommemnded one
		
		WebElement selectedValue1 = sel.getFirstSelectedOption();//return selected value 
		System.out.println(selectedValue1.getText());
		
	}

}
