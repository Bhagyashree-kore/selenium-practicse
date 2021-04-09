 package com.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptExecutor {

	
	public static void flash(WebElement element, WebDriver driver) throws InterruptedException
	{
		
		String bgcolor = element.getCssValue("backgroundcolor");
		
		for(int i=0 ; i<500; i++)
		{
			changecolor("#000000", element, driver);
			changecolor(bgcolor, element, driver);	
		}
	}
	
	public static  void changecolor(String color, WebElement element, WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor = '" + color +" ' ", element);
		Thread.sleep(40);
		
	}
	
	public  void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px 	solid red'", element);
	}
	
	
	public  String getTittlePage (WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String tittle = js.executeScript("return document.tittle;").toString();		
		return tittle;
	}
	
	public  void clickByElement(WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguements[0].click()", element);
	}
	
	public static void generateAlert(WebDriver driver, String Message)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert(' " +Message+ " ' )");
		
	}
	
	public static void refreshPage(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static void ScrollUptoElement(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoview(true)", element);
		
	}
	
	public static void ScrollUptoEnd(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)" );
		
	}
	
	
}

 
