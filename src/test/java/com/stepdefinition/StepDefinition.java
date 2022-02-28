package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.Adac.Base_Class;
import com.adactin.Adac.TestRunner;
import com.pom.Login_In;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class StepDefinition  extends Base_Class{
	public static WebDriver driver=TestRunner.driver; //null
	public static Login_In login=new Login_In(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrlmethod("https://adactinhotelapp.com/");
	}

	@When("^user Enters The Username In \"([^\"]*)\" Field$")
	public void user_Enters_The_Username_In_Field(String username) throws Throwable {
		methodforinput(login.getLogin(),username);
	}

	@When("^user Enters The Password In \"([^\"]*)\" Field$")
	public void user_Enters_The_Password_In_Field(String password) throws Throwable {
		methodforinput(login.getLogin(),password);
	}

	@Then("^user Click On The Login Button And Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		methodforclick(login.getLog());
	    
	}



}
