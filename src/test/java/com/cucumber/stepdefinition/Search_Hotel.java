package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Page_Object_Manager;
import com.cucumber.runner.Runner;
import com.cucumber.runner.Runner1;

import cucumber.api.java.en.*;
import gherkin.formatter.Argument;

public class Search_Hotel extends Base_class{
	public static WebDriver driver=Runner1.driver;
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	

@Given("^Give the location \"([^\"]*)\" \"([^\"]*)\"$")
public void give_the_location(String arg1, String arg2)  {
    selections(pom.getSh().getLocation_1(), arg1, arg2); 
}

@Then("^Give the hotel \"([^\"]*)\" \"([^\"]*)\"$")
public void give_the_hotel(String arg1, String arg2)  {
    selections(pom.getSh().getHotel_2(), arg1, arg2);
    
}

@Then("^Room type \"([^\"]*)\" \"([^\"]*)\"$")
public void room_type(String arg1, String arg2)  {
    
  selections(pom.getSh().getRoomType_3(), arg1, arg2);  
}

@Then("^No of rooms \"([^\"]*)\" \"([^\"]*)\"$")
public void no_of_rooms(String arg1, String arg2)  {
    
    selections(pom.getSh().getRoomNo_4(), arg1, arg2);
}

@Then("^Clear value$")
public void clear_value()  {
   clea(pom.getSh().getCheckIn_5());
    
}

@Then("^Check in date \"([^\"]*)\"$")
public void check_in_date(String arg1)  {
    send(pom.getSh().getCheckIn_5(), arg1);
    
}

@Then("^Clear value2$")
public void clear_value2()  {
	clea(pom.getSh().getCheckOut_6());
    
}



@Then("^check out date \"([^\"]*)\"$")
public void check_out_date(String arg1)  {
    send(pom.getSh().getCheckOut_6(), arg1);
    
}

@Then("^Adult room \"([^\"]*)\" \"([^\"]*)\"$")
public void adult_room(String arg1, String arg2)  {
    
    selections(pom.getSh().getAdultRoom_7(), arg1, arg2);
}

@Then("^Child room \"([^\"]*)\" \"([^\"]*)\"$")
public void child_room(String arg1, String arg2)  {
    selections(pom.getSh().getChildRoom_8(), arg1, arg2);
    
}

@Then("^Submit$")
public void submit()  {
    clickkk(pom.getSh().getSubmit_9());
    
}




}
