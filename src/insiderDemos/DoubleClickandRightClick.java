package insiderDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickandRightClick {
	
	@Test
	
	public static void setup()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		WebElement ele = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(ele).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		WebElement ele1 = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(ele1).perform();
		
	
		
		
		

		
	}

}
