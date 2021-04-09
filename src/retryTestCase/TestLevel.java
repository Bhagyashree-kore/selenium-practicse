package retryTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLevel {
	
	@Test
	public void Test1()
	{
		Assert.assertTrue(true);
	}
	

	public void Test2()
	{
		Assert.assertTrue(false);
	}

}
