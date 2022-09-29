package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement a1 = driver.findElement(By.id("vfb-6-0"));
		a1.click();
		//String text = a1.getText();
		//System.out.println(text);
		System.out.println(a1.getText());   //getText
		
		boolean b = a1.isEnabled();
		System.out.println(b);
		//System.out.println(a1.isEnabled());   //isEnabled
		
		System.out.println(a1.isDisplayed()); // isDisplayed
		
		boolean b1 = a1.isSelected();  // performed on check boxes and radio button.
		a1.click();
		System.out.println(b1);  
		
	}

}
