package insiderDemos;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WinHandle {
	
	@Test
	public void WinHanlde()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parentWindow = driver.getWindowHandle();	
		System.out.println(parentWindow);
		
		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());
		
		int count = window.size();
		
		for(String str1 : window)
		{
			if(!str1.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(str1);
				driver.findElement(By.id("firstName")).sendKeys("Bhagyashree");
				driver.close();
			}
			 
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("Kore");
		
		
		
		
		
	}

}
