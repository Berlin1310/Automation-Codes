package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver OpenChromeBrowser() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		return driver;
	}

	public static WebDriver OpenEdgeBrowser() {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		return driver;
	}

	public static WebDriver OpenFirefoxBrowser() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		return driver;
	}

    public static WebDriver OpenOperaBrowser() {
		
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		
		return driver;	
}
}
