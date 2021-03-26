package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Page_Object_Manager;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class CucuBackgroundSd extends Base_class{
	public static WebDriver driver=Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	@Given("^give the url \"([^\"]*)\"$")
	public void give_the_url(String arg1)  {
	 get_url(arg1);
	}

	@When("^give the username \"([^\"]*)\"$")
	public void give_the_username(String arg1)  {
	 send(pom.getF().getUser(), arg1);
	}

	@Then("^give the password \"([^\"]*)\"$")
	public void give_the_password(String arg1) {
	    send(pom.getF().getPass(), arg1);
	}

	@Then("^submit the given details$")
	public void submit_the_given_details()  {
	    clickkk(pom.getF().getLogin());
	}


}
