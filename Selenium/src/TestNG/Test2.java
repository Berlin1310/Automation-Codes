package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
 
	@BeforeTest
	public void btest() {
		System.out.println("I am Before Test method");
	}
	
	@AfterTest
	public void atest() {
		System.out.println("I am After Test method");
	}
	
	@Test
  public void e() {
		
		//long e1 = Thread.currentThread().getId();
		//System.out.println("e method executes on thread no. "+e1);
		System.out.println("I am e method");
  }
	
	@Test
	  public void f() {
		
		//long f1 = Thread.currentThread().getId();
		//System.out.println("f method executes on thread no. "+f1);
		System.out.println("I am f method");
	  }
}
