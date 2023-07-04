package com.limestonenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public static WebDriver driver1;

	@FindBy ( id = "shopmen")
	
	private WebElement Shopmen;

	public WebElement getShopmen() {
		return Shopmen;
	}

	
	public loginpage(WebDriver driver2) {
		
		this.driver1 =driver2;
		
		PageFactory.initElements(driver1, this);
	}
	
}
