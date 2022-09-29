package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_II {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		
		//driver.get("https://www.facebook.com/");   // for Tab keys
		
		driver.get("https://www.google.co.in/");  // for enter on gmail
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		//WebElement username = driver.findElement(By.id("email"));
		//username.sendKeys("abcd@gmail.com");
		//Thread.sleep(2000);
		//WebElement password = driver.findElement(By.id("pass"));
		//password.sendKeys("12345");
		//Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		act.sendKeys(gmail, Keys.ENTER).build().perform();
		
		//act.sendKeys(Keys.TAB).build().perform();
		
		//Thread.sleep(2000);
		
		//act.sendKeys(Keys.TAB).build().perform();
		
		//WebElement login = driver.findElement(By.name("login"));
		//login.click();
		
		
		//for(int i=1;i<=13;i++) {
		//	act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//	Thread.sleep(1000);
	//}
		//Thread.sleep(3000);
		//
		//for(int i=1;i<=8;i++) {
			//act.sendKeys(Keys.ARROW_UP).build().perform();
			//Thread.sleep(1000);
	//}
		//act.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(2000);
		//act.sendKeys(Keys.ENTER).build().perform(); // this can also be used.
		
		//driver.findElement(By.id("nav-search-submit-button")).click();   //this is used
	}
}
