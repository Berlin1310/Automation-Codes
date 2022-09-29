package FailedScrnShot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B2 extends A1 {
	
	@Test
	public void chrome() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.jio.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		Assert.assertEquals("Jio - Best Prepaid, Postpaid Plans, Broadband Connection, Apps, & More1", title);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
