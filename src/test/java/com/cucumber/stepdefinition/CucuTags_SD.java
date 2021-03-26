package com.cucumber.stepdefinition;


import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Page_Object_Manager;
import com.cucumber.runner.Runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class CucuTags_SD extends Base_class {
	public static WebDriver driver= Runner.driver;
Page_Object_Manager pom=new Page_Object_Manager(driver);

/*
 * @Before public void setup() { // TODO Auto-generated method stub
 * get_url("https://adactinhotelapp.com/"); }
 * 
 * @After public void closee() { // TODO Auto-generated method stub
 * driver.close(); }
 */

@Given("^enter the url \"([^\"]*)\"$")
public void enter_the_url(String arg1)  {
 //  System.out.println("sucessfully launched");  
	get_url(arg1);
}

@Then("^enter the username \"([^\"]*)\"$")
public void enter_the_username(String arg1)  {
    send(pom.getF().getUser(), arg1);
    
}

@Then("^enter the password \"([^\"]*)\"$")
public void enter_the_password(String arg1)  {
    
    send(pom.getF().getPass(), arg1);
}

@Then("^click on the Login button$")
public void click_on_the_Login_button()  {
    clic(pom.getF().getLogin());
    
}

@Given("^user already in the search page$")
public void user_already_in_the_search_page()  {
    
    
}

@Then("^enter the location \"([^\"]*)\" \"([^\"]*)\"$")
public void enter_the_location(String arg1, String arg2)  {
    
    
}

@Then("^enter the hotel name \"([^\"]*)\" \"([^\"]*)\"$")
public void enter_the_hotel_name(String arg1, String arg2)  {
    
    
}

@Then("^enter the room type \"([^\"]*)\" \"([^\"]*)\"$")
public void enter_the_room_type(String arg1, String arg2)  {
    
    
}

@Then("^enter the room number \"([^\"]*)\" \"([^\"]*)\"$")
public void enter_the_room_number(String arg1, String arg2)  {
    
    
}

@Then("^enter the checkin \"([^\"]*)\"$")
public void enter_the_checkin(String arg1)  {
    
    
}

@Then("^enter the checkout \"([^\"]*)\"$")
public void enter_the_checkout(String arg1)  {
    
    
}

@Then("^enter the adult room \"([^\"]*)\" \"([^\"]*)\"$")
public void enter_the_adult_room(String arg1, String arg2)  {
    
    
}

@Then("^enter the child room \"([^\"]*)\" \"([^\"]*)\"$")
public void enter_the_child_room(String arg1, String arg2)  {
    
    
}

@Then("^enter the submit$")
public void enter_the_submit()  {
    
    
}

@Given("^already in giving the personal details$")
public void already_in_giving_the_personal_details()  {
    
    
}

@Then("^click the radio button$")
public void click_the_radio_button()  {
    
    
}

@Then("^click the continue button$")
public void click_the_continue_button()  {
    
    
}

@Given("^give the firstname \"([^\"]*)\"$")
public void give_the_firstname(String arg1)  {
    
    
}

@Then("^give the lastname \"([^\"]*)\"$")
public void give_the_lastname(String arg1)  {
    
    
}

@Then("^give the address \"([^\"]*)\"$")
public void give_the_address(String arg1)  {
    
    
}

@Then("^give the card num \"([^\"]*)\"$")
public void give_the_card_num(String arg1)  {
    
    
}

@Then("^type of card \"([^\"]*)\" \"([^\"]*)\"$")
public void type_of_card(String arg1, String arg2)  {
    
    
}

@Then("^expiry month of the card \"([^\"]*)\" \"([^\"]*)\"$")
public void expiry_month_of_the_card(String arg1, String arg2)  {
    
    
}

@Then("^expiry year of the card \"([^\"]*)\" \"([^\"]*)\"$")
public void expiry_year_of_the_card(String arg1, String arg2)  {
    
    
}

@Then("^enter the cvv number \"([^\"]*)\"$")
public void enter_the_cvv_number(String arg1)  {
    
    
}

@Then("^click the submit button$")
public void click_the_submit_button()  {
    
    
}
}
