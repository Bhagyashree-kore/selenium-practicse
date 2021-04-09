package screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildScreenshot extends BaseScreenShot {
	
	@BeforeMethod
	public void setUp()
	{
		initilaization();
		
	}
	
	@Test
	public void Test1()
	{
		Assert.assertEquals(true, false);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
