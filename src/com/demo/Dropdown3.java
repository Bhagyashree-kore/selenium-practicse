package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		 
		WebElement ddown =   driver.findElement(By.id("month"));
		Select sel = new Select(ddown);
		
		List<WebElement> list_dd = sel.getOptions();
		System.out.println(list_dd.size());
		
		
		
		for(WebElement ele : list_dd)
		{
			System.out.println(ele.getText()); 
		}
		
		
		
	}

}
