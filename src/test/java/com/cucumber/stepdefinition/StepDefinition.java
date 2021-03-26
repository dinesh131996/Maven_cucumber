package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.runner.Runner;
import com.pom.org.PomForLoginpage;

import cucumber.api.java.en.*;

public class StepDefinition extends Base_class {
	
	public static WebDriver driver=Runner.driver;
	//PomForLoginpage lp = new PomForLoginpage(driver);
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^set up the url$")
	public void set_up_the_url() throws Throwable {
	   get_url("https://adactinhotelapp.com/");
	}

	@Then("^given the username$")
	public void given_the_username() throws Throwable {
		// send(lp.getLogin(), "Dinesh");
		send(pom.getLp().getUser(), "Dinesh"); 
	}

	@Then("^given the password$")
	public void given_the_password() throws Throwable {
		 send(pom.getLp().getPass(), "123456");
	}

	@Then("^click the login button$")
	public void click_the_login_button() throws Throwable {
	   clic(pom.getLp().getLogin());
	}
}
