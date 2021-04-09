package insiderDemos;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class checkBoxAndRadio {

	@Test
	
	public static void SetUP()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\Desktop\\Edge\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.automationtestinginsider.com/p/selenium-vi.html");
	
	List<WebElement> ele = driver.findElements(By.tagName("a"));
	
	System.out.println("old list" +ele.size());
	
	List<WebElement> empty = new ArrayList<WebElement>();
	
	for(int i = 0; i<ele.size();i++)
	{
		if(ele.get(i).getAttribute("href")!=null)
		{
			empty.add(ele.get(i));
		}
	}
	
	System.out.println("new list" +empty.size());
	
	for(int j=0; j<empty.size();j++)
	{
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(empty.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(empty.get(j).getAttribute("href")+ " " +response);
		} catch (Exception e) {
			
			e.getMessage();
		} 
		
	}
	
	}
	
	
	
	
	
	
}
