package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class linkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\\\browser\\\\nw\\\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("korebhagyashree1212@gmail.com");
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("homerk");
		driver.findElement(By.id("u_0_d_Lk")).click();
		

	}

}
