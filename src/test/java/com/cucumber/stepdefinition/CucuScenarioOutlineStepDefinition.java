package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Page_Object_Manager;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class CucuScenarioOutlineStepDefinition extends Base_class {
	public static WebDriver driver= Runner.driver;
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^give the url$")
	public void give_the_url()  {
get_url("https://adactinhotelapp.com/");
	    
	}

	@Then("^Give the user name \"([^\"]*)\"$")
	public void give_the_user_name(String arg1)  {
	send(pom.getF().getUser(), arg1);    
	    
	}

	@Then("^giver the password \"([^\"]*)\"$")
	public void giver_the_password(String arg1)  {
	    
	    send(pom.getF().getPass(), arg1);
	}

	@Then("^Click the Login button$")
	public void click_the_Login_button()  {
	    
	    clic(pom.getF().getLogin());
	}

}
