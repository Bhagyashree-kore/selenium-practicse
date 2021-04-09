package insiderDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertDemo {
	@Test
	public static void AlertD()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.findElement(By.id("simpleAlert")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.id("confirmationAlert")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		driver.findElement(By.id("promptAlert")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys(" Opt YES/NO1111111");
		alert2.accept();
		
	}

}
