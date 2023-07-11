package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.limestonenew.baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\jayak\\eclipse-workspace\\limestone2\\src\\test\\java\\com\\feature\\limestone.feature",glue="com.stepdefinition",
	
	tags ="@tag",
		
	plugin = {"pretty","html:res/lime.html","json:res/lime.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	
	
	
public class runnerclass extends baseclass {
	

		
@BeforeClass

public static void Weblaunch() {
	
	baseclass.launchBrowser("chrome");
	
	
}
}