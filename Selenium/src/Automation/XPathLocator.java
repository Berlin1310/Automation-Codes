package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) {//throws InterruptedException  

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		//xPath by attribute
		//WebElement a1 = driver.findElement(By.xpath("//a[@class='gb_d']"));
		//a1.click();
		
		//XPath by text
		//WebElement a2 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//a2.click();
		
		//Xpath by contains
		//WebElement a3 = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		//a3.click();
		
		//XPath by Index
		//WebElement a4 = driver.findElement(By.xpath("//input[@class='input_error form_input'][1]"));
		//a4.sendKeys("Hello");
		
		WebElement a5 = driver.findElement(By.xpath("(//input[@class='submit-button btn_action'])"));
		a5.click();
		
		//Xpath by AbsoluteIndex
		//WebElement a5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/a"));
		//a5.click();
		
		//Xpath by RelativeIndex
		//WebElement a6 = driver.findElement(By.xpath("//div[2]//a"));
		//a6.click();
		
		
		
		
	}

}
