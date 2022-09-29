package Automation;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {


		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		FileInputStream excel = new FileInputStream("C:/Users/abhij/Desktop/DSS Class/Zerodha Kite Test.xlsx");
		
		Sheet a = WorkbookFactory.create(excel).getSheet("Sheet3");
		long l = (long) a.getRow(0).getCell(1).getNumericCellValue();
		String s = a.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.name("email")).sendKeys(""+l);
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys(s);
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
	
		
		
	}

}
