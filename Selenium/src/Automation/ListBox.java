package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.id("multiselect"));
		
		Select s = new Select(a);
		//Thread.sleep(5000);
		
		//s.selectByIndex(1);
		//Thread.sleep(1000);
		//s.selectByValue("audi");
		//Thread.sleep(1000);
		//s.selectByVisibleText("Hyundai");
		//Thread.sleep(3000);
		
		//s.deselectByIndex(0);
		//Thread.sleep(1000);
		//s.deselectByValue("audi");
		//Thread.sleep(1000);
		//s.deselectByVisibleText("Hyundai");
		//s.deselectAll();
		
		//WebElement b = s.getFirstSelectedOption();
		//System.out.println(b.getText());
		
		//String c = b.getText();
		//System.out.println(c);
		
		//boolean l = s.isMultiple();
		//System.out.println(l);
		
		//Select All options at once
		List<WebElement> b = s.getOptions();
		
		for(int i=0;i<b.size();i++) {
			
			b.get(i).click();
			String t = b.get(i).getText();
			System.out.println(t);
		}
		
		Thread.sleep(3000);
		
		//Deselect all at once
		for(int i=0;i<b.size();i++) {
			
			b.get(i).click();
		}

}
}
