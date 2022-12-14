package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

          System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.guru99.com/test/delete_customer.php");
          driver.manage().window().maximize();
          Thread.sleep(2000);
          
          driver.findElement(By.name("cusid")).sendKeys("abcd12345");
          Thread.sleep(2000);
          driver.findElement(By.name("submit")).click();
          Thread.sleep(2000);
          
          //driver.switchTo().alert().dismiss();
          driver.switchTo().alert().accept();
          Thread.sleep(2000);
          driver.switchTo().alert().accept();
          
          //String a = driver.switchTo().alert().getText();
         // System.out.println(a);
          
          //This Method can also be used
         // Alert ab = driver.switchTo().alert();
         // ab.accept();
        //  ab.dismiss();
          
          //Alert ab = driver.switchTo().alert();
          //String s = ab.getText();
          //System.out.println(s);
		
	}

}
