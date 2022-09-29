package com.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.LogoutPage;
import com.utility.utility;

public class test extends Base {

	WebDriver driver;
	LoginPage loginpage;
	LogoutPage logout;
	HomePage homepage;

	
	@BeforeTest
	@Parameters("Browser")
	public void launchBrowser(String Browser) {
		
		
		if(Browser.equals("Chrome")) {
			driver = Base.OpenChromeBrowser();
		}
		else if(Browser.equals("Edgebrowser")) {
			driver = Base.OpenEdgeBrowser();
		}
		else if(Browser.equals("Firefox")) {
			driver = Base.OpenFirefoxBrowser();
		}
		else if(Browser.equals("Opera")) {
			driver = Base.OpenOperaBrowser();
		}
	}
	
	
	@BeforeClass
	public void HitURL() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void verifyLoginPage() throws InterruptedException, EncryptedDocumentException, IOException {

		loginpage = new LoginPage(driver);

		String data1 = utility.getdatafromExcel(1,0);
		loginpage.ClickOnUsernameTab(data1);
		Thread.sleep(2000);
		
		String data2 = utility.getdatafromExcel(1,1);
		loginpage.ClickOnPasswordTab(data2);
		Thread.sleep(2000);
		
		loginpage.ClickOnLoginTab();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void verifyBackpack() throws InterruptedException {

		homepage = new HomePage(driver);

		homepage.ClickOnBackpackTab();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("https://www.saucedemo.com/inventory-item.html?id=4", url);
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void verifyBikelight() throws InterruptedException {

		homepage = new HomePage(driver);

		homepage.ClickOnBikelightTab();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("https://www.saucedemo.com/inventory-item.html?id=0", url);
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void verifyTshirt() throws InterruptedException {

		homepage = new HomePage(driver);

		homepage.ClickOnTShirtTab();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("https://www.saucedemo.com/inventory-item.html?id=1", url);
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void verifyJacket() throws InterruptedException {

		homepage = new HomePage(driver);

		homepage.ClickOnJacketTab();
		String url = driver.getCurrentUrl();

		Assert.assertEquals("https://www.saucedemo.com/inventory-item.html?id=5", url);
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void verifyOnesie() throws InterruptedException {

		homepage = new HomePage(driver);

		homepage.ClickOnOnesieTab();
		String url = driver.getCurrentUrl();

		Assert.assertEquals("https://www.saucedemo.com/inventory-item.html?id=2", url);
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void verifyRedTshirt() throws InterruptedException {

		homepage = new HomePage(driver);

		homepage.ClickOnRedTshirtTab();
		String url = driver.getCurrentUrl();

		Assert.assertEquals("https://www.saucedemo.com/inventory-item.html?id=3", url);
		Thread.sleep(2000);
	}

	@AfterMethod
	public void Logout(ITestResult result) throws InterruptedException, IOException {

		if(ITestResult.FAILURE==result.getStatus()) {
			
			utility.getScreenshot(driver);
		}
		
		logout = new LogoutPage(driver);

		logout.ClickOnMenuTab();
		Thread.sleep(2000);
		logout.ClickOnLogoutTab();
		Thread.sleep(3000);
	}

	@AfterClass
	public void CloseBrowser() {

		driver.close();
	}

}
