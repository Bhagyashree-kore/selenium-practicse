package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NavigationToUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//get() vs navigate().to() 
		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com/")	;
		
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward()	;
		
		driver.navigate().refresh();
	}

}
