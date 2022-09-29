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

public class test13 extends Test12{
	
	
	@BeforeClass
	public void google() throws InterruptedException {
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		System.out.println("Google is opened");
}
	@AfterClass
    public void Scrnshot() throws IOException {
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d = new File("C:/Users/abhij/Pictures/abc.bmp");
		FileUtils.copyFile(s, d);
		System.out.println("Screenshot is taken");
	}
	
	@BeforeMethod
	public void gmail() throws InterruptedException {
		
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(1000);
		System.out.println("Gmail is opened");
		
	}
	@AfterMethod
    public void url() throws InterruptedException {
		
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(currenturl, "https://www.google.co.in/imghp?hl=en&ogbl");
		Thread.sleep(1000);
		System.out.println("URL is validated");
		
	}
	
	@Test
	public void image() throws InterruptedException {
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("Homepage is opened");
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		System.out.println("Images page is opened");
	}
	
}
