package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {
	
	@BeforeClass
	public void bclass() {
		System.out.println("I am Before Class method");
	}
	
	@AfterClass
	public void aclass() {
		System.out.println("I am After Class method");
	}
	
	@BeforeMethod
	public void bmethod() {
		System.out.println("I am Before method");
	}
	
	@AfterMethod
	public void amethod() {
		System.out.println("I am After method");
	}
	
  @Test    //(groups= {"sanity"})   //(priority=2)
  public void a() {
	  
	  //long a1 = Thread.currentThread().getId();
	 // System.out.println("a method executes on thread no. "+a1);
	  System.out.println("I am A Method");
	  
  }
 
  
  @Test       //(groups= {"regression"},priority=2) // this is grouping
 public void b() {
	  //Assert.assertEquals("hello", "hello1");
	 
	  //long b1 = Thread.currentThread().getId();
	 // System.out.println("b method executes on thread no. "+b1);
	  System.out.println("I am B Method");
  }
  
  
  @Test       //(groups= {"regression"},priority=1) //(dependsOnMethods= {"b"},alwaysRun=true)//(priority=1)
  public void c() {
	 
	  //long c1 = Thread.currentThread().getId();
	  //System.out.println("c method executes on thread no. "+c1);
	 System.out.println("I am C Method");
  }
  
  @Test(timeOut=1000)       //(enabled=false)   //(invocationCount=5)
  public void d() {
	  
	  //String expected_title = "Hala Madrid";
	 // String actual_title = "Halla Maadrid";
	 // System.out.println("Test case execution starts");
	 
	  //SoftAssert sa = new SoftAssert();  // SoftAssert
	 // sa.assertEquals(actual_title, expected_title);
	 
	  //Assert.assertEquals(actual_title, expected_title);  // HardAssert
	 // System.out.println("Test case execution finished");
	  
	 
	  //long d1 = Thread.currentThread().getId();
	  //System.out.println("d method executes on thread no. "+d1);
	  System.out.println("I am D Method");
  }
}
