package com.limestonenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends baseclass  {
	
	

	@FindBy ( id = "shopMen")
	
	private WebElement Shopmen;

	public WebElement getShopmen() {
		return Shopmen;
	}

	
	public loginpage() {
		
		
		
		PageFactory.initElements(driver,this);
	}
	
}
