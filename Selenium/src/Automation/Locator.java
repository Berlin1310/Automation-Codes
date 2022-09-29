package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//tagName
		//WebElement a1 = driver.findElement(By.tagName("a"));
		//a1.click();
		
		//ClassName
		//WebElement a2 = driver.findElement(By.className("gb_d"));
		//a2.click();
		
		//Id
		//WebElement a3 = driver.findElement(By.id("email")); //no id in Gmail so use other code where id is present.
		//a3.sendKeys("Pooja");
		
		//Name
		//WebElement a4 = driver.findElement(By.name("email"));
		//a4.click();
		
		//LinkText
		//WebElement a5 = driver.findElement(By.linkText("Gmail"));
		//a5.click();
		
		//PartialLinkTest
		WebElement a6 = driver.findElement(By.partialLinkText("Gma"));
		a6.click();
	}

}
