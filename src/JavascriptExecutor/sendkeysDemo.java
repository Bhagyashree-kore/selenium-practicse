package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendkeysDemo {
	
	public static void main(String args[])
	{
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	driver.get("https://login.yahoo.com/");
	
	WebElement username = driver.findElement(By.id("login-username"));
	
	WebElement checkbox = driver.findElement(By.id("persistent"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].value='ABC'", username);// first approach
	js.executeScript("arguments[0].value=arguments[1] ", username,"ABC");//second approach	
	js.executeScript("arguments[0].click()", checkbox);

}}
