package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are: "+links.size());
		
		for(int i=0;i<links.size();i++) {
			
			String a = links.get(i).getText();
			System.out.println(a);
			Thread.sleep(1000);
		}
	}

}
