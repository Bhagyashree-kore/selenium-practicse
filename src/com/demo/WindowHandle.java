package com.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.id("")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String ParentWindow = it.next();
		String ChildWindow =it.next();
		driver.switchTo().window(ChildWindow);
		driver.close();
		
		

	}

}
