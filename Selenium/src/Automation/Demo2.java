package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Point p = new Point(300,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		
		Dimension d = new Dimension(500,400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.close();
	}

}
