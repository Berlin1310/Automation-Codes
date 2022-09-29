package FailedScrnShot;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_launchbrowser extends A_MainTest 
{
	@Test
	public void browser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("window curtains");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String title = driver.getTitle();
		Assert.assertEquals("Amazon.in : window curtains1", title);
		
		Thread.sleep(2000);
		
		driver.close();
				
	}

}
