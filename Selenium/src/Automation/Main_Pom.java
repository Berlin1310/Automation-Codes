package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Pom {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		PomClass_I pom = new PomClass_I(driver);
		pom.Search();
		Thread.sleep(2000);
		pom.butn();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		PomClass2 pom2 = new PomClass2(driver);
		pom2.mail();
	}

}
