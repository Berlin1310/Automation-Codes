package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> a = abc.iterator();
		a.next();
		String s = a.next();
		driver.switchTo().window(s);
		Thread.sleep(2000); 
		
		driver.findElement(By.name("emailid")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		
		driver.quit();
		
		
		
	}

}
