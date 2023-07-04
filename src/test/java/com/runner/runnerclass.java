package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.limestonenew.baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\jayak\\eclipse-workspace\\limestonenew\\src\\test\\java\\com\\feature\\limestone.feature", glue ="com.stepdefination",
	
			plugin = {"pretty", "html:Reports/lime.html", "json:Reports/lime.json"})

	public class runnerclass {
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void Weblaunch() {
		
		driver= baseclass.launchBrowser("chrome") ;
		
	}
}


