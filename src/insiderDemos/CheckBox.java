package insiderDemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckBox {

	
	@Test
	public static void CheckBOX()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(ele.size());
		
		for(int i=0;i<=ele.size()-1;i++)
		{
			if(ele.get(i).getAttribute("value").equalsIgnoreCase("CheckBox2"))
			{
				ele.get(i).click();
			}
		}
		
		
	}
}
