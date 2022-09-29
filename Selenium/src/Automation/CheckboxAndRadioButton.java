package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadioButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Clicking on individual elements
//		driver.findElement(By.id("vfb-7-1")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("vfb-7-2")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("vfb-7-3")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("vfb-6-0")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("vfb-6-1")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("vfb-6-2")).click();
		
		//List<WebElement> abc = driver.findElements(By.xpath("//input[@type='radio']")); // for radio buttons
		
		List<WebElement> abc = driver.findElements(By.name("webform")); // all buttons as same locator
		for(int i=0;i<abc.size();i++) {
			
			abc.get(i).click();
			Thread.sleep(2000);
		}
		
	}

}
