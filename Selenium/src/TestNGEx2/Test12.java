package TestNGEx2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test12  {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Start");
	}
	
	@BeforeTest
	public void browser() throws InterruptedException {
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("Browser is maximized");
	}
	
	@AfterTest
  public void refresh() throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("Refresh is complete");
		
		driver.close();
		System.out.println("Browser is closed");
	}
	
	@AfterSuite
	public void complete() {
		
		System.out.println("END");
	}

}
