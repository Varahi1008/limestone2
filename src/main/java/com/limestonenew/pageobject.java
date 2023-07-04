package com.limestonenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageobject {
	
	public WebDriver driver;
	
	public loginpage lp;
	
	public  pageobject(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public loginpage getloginpage() {
		
		if (lp == null)
			
		{
			lp = new loginpage(driver);
			
		}
		
		return lp;
	}
	
	

}
