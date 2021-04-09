package com.demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JavascriptFlash {
	
	private static javascriptExecutor JavaScriptUtil;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		
		//hightlight webelement
		JavaScriptUtil.flash(ele, driver);
		
		//capture screenshot
		
		//border highlight
		JavaScriptUtil.drawBorder(ele, driver);  
		
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//File target = new File("C://Users/acer/eclipse-workspace/demo/src/com/demo/A.png");
		//FileUtils.copyFile(src,target);
		
		//Tittle of page
		String str1 = JavaScriptUtil.getTittlePage(driver);
		System.out.println(str1);
		
		//click on element
		 WebElement ele1 = driver.findElement(By.id(""));
		 JavaScriptUtil.clickByElement(ele1, driver);
		 
		 //alert generation
		 JavaScriptUtil.generateAlert(driver, "You clicked on alert Button");
		 
		//refresh page
		 
		 JavaScriptUtil.refreshPage(driver);
		 
		 JavaScriptUtil.ScrollUptoElement(ele1, driver);
		 
		 JavaScriptUtil.ScrollUptoEnd(driver);
		 
		
		
		
	}

}
