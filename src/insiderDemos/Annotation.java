package insiderDemos;

import org.testng.annotations.Test;

public class Annotation {

	@Test
	public void A() {
		System.out.println("Inside A");
	}
	
	
	
	@Test(priority=-1)
	public void B() {
		System.out.println("Inside B");
		
	}
	
	@Test(priority=1)
	public void C() {
		System.out.println("Inside c");
		
	}
	
	@Test
	public void D() {
		System.out.println("Inside D");
	}

	
}
