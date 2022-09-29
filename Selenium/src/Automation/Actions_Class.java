package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.co.in/");
		
		driver.get("http://www.uitestpractice.com/Students/Actions");   // for doubleclick and draganddrop
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//WebElement a = driver.findElement(By.name("dblClick"));
		
		WebElement s = driver.findElement(By.id("draggable")); //for drag
		
		WebElement d = driver.findElement(By.id("droppable")); // for drop
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(a).build().perform();
		
		//act.click(a).build().perform();
		
		//act.contextClick(a).build().perform();

		//act.doubleClick(a).build().perform();  
		
		//Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();   // alert popup in double click
		
		act.dragAndDrop(s, d).build().perform();
		
		
		
	}

}
