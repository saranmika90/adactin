package com.adactin.Adac;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//feature",
glue="com.stepdefinition.StepDefinition",
monochrome=true,
dryRun=false,
strict=false,
tags= ("@smokeTest"),
plugin= {"html:Report/Html_Report",
		"pretty",
		"json:Reports/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
})
public class TestRunner {

	public static WebDriver driver; //null
	
	@Before
	public static void setUp() throws Throwable{
		//String browser=File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		Thread.sleep(7000);
		driver=Base_Class.browserlaunch("chrome");
	}
	
	@After
	public static void tearDown() {
		driver.close();
	}
	
}