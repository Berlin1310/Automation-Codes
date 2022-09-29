package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("germany");
		Thread.sleep(2000);
		
		List<WebElement> abc = driver.findElements(By.tagName("li"));
		
		for(int i=0;i<abc.size();i++) {
			String s = abc.get(i).getText();
			System.out.println(s);
			Thread.sleep(1000);
		}
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		for(int i=0;i<5;i++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
		}
		act.sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
