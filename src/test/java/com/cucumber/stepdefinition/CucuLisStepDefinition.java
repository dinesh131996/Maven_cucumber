package com.cucumber.stepdefinition;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.runner.Runner;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class CucuLisStepDefinition {
	public static WebDriver driver=Runner.driver;
	@Given("^To setup the browser \"([^\"]*)\"$")
	public void to_setup_the_browser(String arg1) throws Throwable {
Base_class.get_url(arg1);
	}

	@Then("^Give the username and password$")
	public void give_the_username_and_password(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		/*
		 * List<List<String>> raw = arg1.raw();
		 * driver.findElement(By.id("username")).sendKeys(raw.get(0).get(0));
		 * driver.findElement(By.id("password")).sendKeys(raw.get(0).get(1));
		 */
		 
		//List<String> list = raw.get(0);
		/*
		 * for (List<String> list : raw) {
		 * driver.findElement(By.id("")).sendKeys(list.get(0))); }
		 */
		// Map<String, String> asMap = arg1.asMap(String.class, String.class);

	}

	@Then("^Click the login button$")
	public void click_the_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
Base_class.click("id", "login");
	}

}
