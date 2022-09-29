package Automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on the page are: "+links.size());
		
		for(int i=0;i<links.size();i++) {
			
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifylinkActive(url);
		}
		
		}

	public static void verifylinkActive(String linkurl) {
		try 
		{
		URL url = new URL(linkurl);
		HttpURLConnection httpurlconnect = (HttpURLConnection)url.openConnection();
		httpurlconnect.setConnectTimeout(3000);
		httpurlconnect.connect();
		if(httpurlconnect.getResponseCode()==200) {
			System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage());
		}
		if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage());
		} 
	} catch(Exception e) {
	}
	}
}

