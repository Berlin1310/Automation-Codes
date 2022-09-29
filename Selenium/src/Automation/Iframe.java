package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0);   //id,name
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(2000);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame(2);
		//driver.switchTo().frame("classFrame");
		Thread.sleep(2000);
		driver.findElement(By.linkText("By.Remotable")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Capabilities")).click();
		
	}

}
