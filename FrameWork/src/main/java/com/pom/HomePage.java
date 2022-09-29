package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	private WebElement backpack;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[2]")
	private WebElement bikelight;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[3]")
	private WebElement tshirt;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[4]")
	private WebElement jacket;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[5]")
	private WebElement onesie;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[6]")
	private WebElement redshirt;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnBackpackTab() {
		
		backpack.click();
	}
	
   public void ClickOnBikelightTab() {
		
	   bikelight.click();
	}
   
   public void ClickOnTShirtTab() {
		
	   tshirt.click();
	}
  
   public void ClickOnJacketTab() {
		
	   jacket.click();
	}
   
   public void ClickOnOnesieTab() {
		
	   onesie.click();
	}
   
   public void ClickOnRedTshirtTab() {
		
	   redshirt.click();
	}
  

}
