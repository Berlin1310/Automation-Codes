package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRealEX {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
	}
	
	@DataProvider(name="TestData")
	public Object getdata() {
		
		Object data[][] = new Object[4][2];
		
		data[0][0]="abhijeetghutukade1437@gmail.com";
		data[0][1]="a9011843963s";
		
		data[1][0]="abhijeet1437@gmail.com";
		data[1][1]="a9011843963s";
		
		data[2][0]="abhijeetghutukade1437@gmail.com";
		data[2][1]="a943963s";
		
		data[3][0]="abhijeet37@gmail.com";
		data[3][1]="a9011843s";
		
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void login(String username,String password) throws InterruptedException {
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		
	}
	
	@AfterMethod
	public void close() {
		
		//driver.close();
	}
	
	

}
