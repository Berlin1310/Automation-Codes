package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "/D://chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		//driver.navigate().to("https://in.tradingview.com/chart/ZB2F9z7v/");
		
		//Thread.sleep(3000);
		
		//driver.navigate().back();
		
		//Thread.sleep(3000);
		
		//driver.navigate().forward();
		
		//Thread.sleep(3000);
		
		//driver.navigate().refresh();
		
		//Thread.sleep(3000);
		
		//driver.get("https://in.tradingview.com/");
		
		//driver.manage().window().minimize();
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//String PS=driver.getPageSource();
		//System.out.println(PS);
		
		//Thread.sleep(3000);
		
		//driver.close();
		//driver.quit();
	}

}
