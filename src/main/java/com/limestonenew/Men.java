package com.limestonenew;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men extends baseclass {

	public Men()
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id ="menjeans")	
private WebElement jean;

@FindBy (xpath ="//span[@class=' h321  dB vT pR bgF wp100']")
private List<WebElement> allJeans;

@FindBy(xpath ="//div[@class='prdC fs12 p8  pR taC bs  ']")
private List<WebElement> allItems;

@FindBy (xpath ="//span[text()=' 30 ']")
private WebElement sizeThirty;

@FindBy (xpath ="//div[text()='ADD TO CART']")
private WebElement addCart;



public WebElement getAddCart() {
	return addCart;
}

public WebElement getSizeThirty() {
	return sizeThirty;
}

public void setSizeThirty(WebElement sizeThirty) {
	this.sizeThirty = sizeThirty;
}

public List<WebElement> getAllItems() {
	return allItems;
}

public WebElement getJean() {
	return jean;
}

public List<WebElement> getAllJeans() {
	return allJeans;
}

public void setAllJeans(List<WebElement> allJeans) {
	this.allJeans = allJeans;
}
	

}
