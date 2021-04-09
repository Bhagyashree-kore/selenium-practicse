package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Dd_span {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("*[@id=\"menu1\"]")).click();
		
		List<WebElement> list_dd =  driver.findElements(By.xpath("ul[@class=\"dropdown-menu\"]"));
		
		for(WebElement ele : list_dd)
		{
			
			String innerhtml = ele.getAttribute("innerHTML");
			
			if(innerhtml.contentEquals("Javascript"))
			{
				ele.click();
				break;
			}
		
		 
		}
	}
}
		



