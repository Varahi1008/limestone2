package com.limestonenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageobject extends baseclass {
	
	
	
	public loginpage lp;
	public Men m;
	
	public Men getMen() {
		if(m == null)
		{
			m = new Men();
		}
		
		return m;
	}

	

	public  pageobject() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	public loginpage getloginpage() {
		
		if (lp == null)
			
		{
			lp = new loginpage();
			
		}
		
		return lp;
	}
	
	

}
