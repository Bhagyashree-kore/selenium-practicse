package insiderDemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	
	@Test
	public static void ddown() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		

        driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
        
        WebElement ele = driver.findElement(By.xpath("//*[@id='Birthday_Day']"));
        Select sel = new Select(ele);
        
        sel.selectByIndex(1);
        Thread.sleep(3000);
        
        WebElement ele1 = driver.findElement(By.xpath("//*[@id='Birthday_Month']"));
        Select sel1 = new Select(ele1);
        
        sel1.selectByValue("January");
        
        WebElement ele2 = driver.findElement(By.xpath("//*[@id='Birthday_Year']"));
        Select sel2 = new Select(ele2);
        
        sel2.selectByVisibleText("1993");
        
   
		WebElement web1 = sel1.getFirstSelectedOption();
		
		System.out.println(web1.getText());
		
		List<WebElement> ddlist = sel2.getAllSelectedOptions();
		for(WebElement dd : ddlist)
		{
			System.out.println(dd.getText());
		}
		
		
		
		
	
		
		
	}

}
