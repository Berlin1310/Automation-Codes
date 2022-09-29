package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="(//input[@class='input_error form_input'])[1]")
	private WebElement username;
	
	@FindBy(xpath="(//input[@class='input_error form_input'])[2]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@class='submit-button btn_action'])")
	private WebElement logintab;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnUsernameTab(String Username) {
		
		username.sendKeys(Username);
	}
	
	public void ClickOnPasswordTab(String Password) {
		
		password.sendKeys(Password);
	}
	
	public void ClickOnLoginTab() {
		
		logintab.click();
	}

}
