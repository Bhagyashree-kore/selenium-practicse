package insiderDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FbLogin {
	
	@Test
	public static void setUp()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MICROSECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("korebhagyashree1212@gmail.com");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("homerk");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();
		
		
		}
	

}
