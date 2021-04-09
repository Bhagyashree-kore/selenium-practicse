package screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseScreenShot {

	public WebDriver driver;
	
	public  void initilaization()
	{
		System.setProperty("webdriver.ie.driver", "C:\\browser\\nw\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	public void TakeScreenShot()
	{
		
		File Scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.CopyFile(Scr, new File(""));
		
	}
	
}
