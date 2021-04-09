package insiderDemos;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	
	@Test
	public void setUp() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String ParentWinow = driver.getWindowHandle();
		System.out.println("parentWindow" +ParentWinow );
		
		Set<String> allwindow =  driver.getWindowHandles();
		System.out.println("All Window" +allwindow.size());
		
		for(String all : allwindow )
		{
			System.out.println(all);
		}
		
		Iterator<String> itr = allwindow.iterator();
		while(itr.hasNext())
		{
			String childwindow = itr.next();
			if(!ParentWinow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println("Url" +driver.getCurrentUrl());
				System.out.println("Tittle" +driver.getTitle());
				Thread.sleep(2000);
			}
			
		}
		
		
		
		
		
	}

}
