package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement Menu;
	
	@FindBy(xpath="(//a[@class='bm-item menu-item'])[3]")
	private WebElement Logout;

	public LogoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnMenuTab() {
		
		Menu.click();
	}
	
	public void ClickOnLogoutTab() {
		
		Logout.click();
	}
}
