package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass2 {
	
	@FindBy(linkText = "Gmail")
	private WebElement gmail;
	
	
	public PomClass2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void mail() {
		gmail.click();
	}

}
