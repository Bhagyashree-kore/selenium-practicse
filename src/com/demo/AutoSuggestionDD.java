package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestionDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		
		driver.findElement(By.id("tags")).sendKeys("S");
	List <WebElement> lst_dd = driver.findElements(By.xpath("//li[@class='ui-menu-item']//div"));
	System.out.println(lst_dd.size());
	
	for(WebElement ele : lst_dd)
	{
		if(ele.getText()=="Selenium")
		{
			ele.click();
			break;
		}
	
	}
	 
	}
}
