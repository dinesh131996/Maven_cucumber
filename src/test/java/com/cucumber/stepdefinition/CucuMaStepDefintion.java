package com.cucumber.stepdefinition;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Page_Object_Manager;
import com.cucumber.runner.Runner;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import cucumber.api.java.en.Then;

public class CucuMaStepDefintion extends Base_class {
	public static WebDriver driver=Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	@Given("^Give the url$")
	public void give_the_url(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   // throw new PendingException();
		for (Map<String, String> thi : arg1.asMaps(String.class, String.class)) {
			//driver.get(thi.get("url"));
			get_url(thi.get("url"));
		}
	}

	@Then("^Given the username and password$")
	public void given_the_username_and_password(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	  //  throw new PendingException();
		
		for (Map<String, String> thi : arg1.asMaps(String.class, String.class)) {
			//driver.findElement(By.id("username")).clear();
			//driver.findElement(By.id("username")).sendKeys(thi.get("username"));
			//driver.findElement(By.id("password")).clear();
			//driver.findElement(By.id("password")).sendKeys(thi.get("password"));
			//Base_class.click("id", "login");
			
		send(pom.getF().getUser(), thi.get("username"));
		send(pom.getF().getPass(), thi.get("password"));	
		clic(pom.getF().getLogin());	
		navigation("to", "https://adactinhotelapp.com/");	
		}
	}

	@Then("^Click the login buttonn$")
	public void click_the_login_buttonn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	
	System.out.println("Dinesh");
	}


}
