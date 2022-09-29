package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass_I {
	
	@FindBy(name="q")
	private WebElement Searchbox;
	
	@FindBy(name="btnK")
	private WebElement SearchButn;
	
	public PomClass_I(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Search() {
		Searchbox.sendKeys("Osmanabad");
	}
	
	public void butn() {
		SearchButn.click();
	}
	
	

}
