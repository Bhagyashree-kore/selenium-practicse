package insiderDemos;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MulWindow {
	
	@Test
	public void mulwin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowsBtn")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		for(String str : windows)
		{
			driver.switchTo().window(str);
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
			driver.close();
		}
	}
	

}
