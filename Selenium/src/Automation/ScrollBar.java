package Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(0,6000)");
		
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
