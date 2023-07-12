package com.stepdefinition;

import org.openqa.selenium.StaleElementReferenceException;

import com.limestonenew.baseclass;
import com.limestonenew.pageobject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition extends baseclass {
	
	   pageobject pom = new pageobject();
	@Given("User launch the url {string}")
	public void user_launch_the_url(String string) {
	   launchUrl(string);//launching the urlfrom limestone.feautue "" into string 
	}

	@Given("User click on shop men")
	public void user_click_on_shop_men() {
	
		sleep(3);
	clickButton(pom.getloginpage().getShopmen());
	
	}

	@Given("User click on jean")
	public void user_click_on_jean() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		clickButton(pom.getMen().getJean());
		
	   }

	@When("Choose the fisrt model")
	public void choose_the_fisrt_model() {
	 sleep(5);
	   try {
		   clickButton(pom.getMen().getAllJeans().get(0));
	   }
	   
	   catch(StaleElementReferenceException e)
	   {
		   driver.navigate().refresh();
		   
		   clickButton(pom.getMen().getAllJeans().get(0));
		  
	   }
	}

	@Given("User click on first product")
	public void user_click_on_first_product() {
	 sleep(5);
	   clickButton(pom.getMen().getAllItems().get(0));
	}

	@When("Select size")
	public void select_size() {
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    clickButton(pom.getMen().getSizeThirty());
	}

	@Then("Add to Cart")
	public void add_to_cart() {
		 sleep(5);
		    clickButton(pom.getMen().getAddCart());
	}



}
