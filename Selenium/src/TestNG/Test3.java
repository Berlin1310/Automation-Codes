package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
  
	@BeforeSuite
	public void bsuite() {
		System.out.println("I am Before Suite method");
	}
	
	@AfterSuite
	public void asuite() {
		System.out.println("I am After Suite method");
	}
	
	@Test
  public void g() {
		
		//long g1 = Thread.currentThread().getId();
		//System.out.println("g method executes on thread no. "+g1);
		System.out.println("I am g method");
  }
	
	@Test
  public void h() {
		
		//long h1 = Thread.currentThread().getId();
		//System.out.println("h method executes on thread no. "+h1);
		System.out.println("I am h method");
  }
	
}
