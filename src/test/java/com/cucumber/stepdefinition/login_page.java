package com.cucumber.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Configure_property;
import com.cucumber.helper.Filemanageer;
import com.cucumber.helper.Page_Object_Manager;
import com.cucumber.runner.Runner;
import com.cucumber.runner.Runner1;
import com.pom.org.First_Page;

import cucumber.api.java.en.*;

public class login_page extends Base_class{
	
	public static WebDriver driver=Runner1.driver;
	First_Page f = new First_Page(driver);
	Page_Object_Manager pom =new  Page_Object_Manager(driver);
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
	 
		String url = Filemanageer.instance().config().url();
		get_url(url);
		//get_url("https://adactinhotelapp.com/");
	}

	@When("^username is given$")
	public void username_is_given() throws Throwable {
		
	//String username = Filemanageer.instance().config().username();
	//send(pom.getF().getUser(), username);
		send(f.getUser(), "DineshDineshDineshDi");
	}

	@Then("^password is given$")
	public void password_is_given() throws Throwable {
	   String password = Configure_property.password();
		send(pom.getF().getPass(), password);
		//send(pom.getF().getPass(), "123456");
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
	clickkk(pom.getF().getLogin());
	}


}
