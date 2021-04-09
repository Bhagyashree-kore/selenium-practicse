package insiderDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigateDemo {
	
	@Test
	public static void Navi()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.google.com");
		System.out.println("Google Tittle" +driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		System.out.println("FB Tittle" +driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Back Tittle" +driver.getTitle());

		driver.navigate().forward();
		System.out.println("forward Tittle" +driver.getTitle());
		
	}

}
