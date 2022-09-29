package TestNGExample;

import static org.testng.Assert.assertEquals;

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

public class Test11 {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void chromesetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Setup process is completed");
	}
	
	@BeforeTest
	public void profilesetup() throws InterruptedException {
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Tab is maximized");
	}
	
	@BeforeClass
	public void appsetup() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println("App setup completed");
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		
		driver.findElement(By.name("email")).sendKeys("abhijeetghutukade1437gmail.com");
		driver.findElement(By.name("pass")).sendKeys("a9011843963s");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		System.out.println("Login process is completed");
	}
	
	@Test
	public void url() {
		
		String currentURL = driver.getCurrentUrl();
		 Assert.assertEquals(currentURL, "https://www.facebook.com/");
		System.out.println("url validation is complete");
	}
	
	@AfterMethod
	public void Scrnshot() throws IOException {
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:/Users/abhij/Pictures/abc.bmp");
		
		FileUtils.copyFile(s, d);
		
		System.out.println("Screenshot taken");
	}
	
	@AfterClass
	public void close() {
		
		driver.close();
		System.out.println("Tab closed");
	}
	
	@AfterTest
	public void report() {
		
		System.out.println("Report is ready");
	}
	
	@AfterSuite
	public void cleanup() {
		
		System.out.println("All cleanup activities completed");
	}

}
