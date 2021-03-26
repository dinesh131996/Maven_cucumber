package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotell {
	
	public static WebDriver driver;
	
@FindBy(id="location")
private WebElement location_1;
public Search_Hotell(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}
public WebElement getLocation_1() {
	return location_1;
}
public WebElement getHotel_2() {
	return hotel_2;
}
public WebElement getRoomType_3() {
	return roomType_3;
}
public WebElement getRoomNo_4() {
	return roomNo_4;
}
public WebElement getCheckIn_5() {
	return checkIn_5;
}
public WebElement getCheckOut_6() {
	return checkOut_6;
}
public WebElement getAdultRoom_7() {
	return adultRoom_7;
}
public WebElement getChildRoom_8() {
	return childRoom_8;
}
public WebElement getSubmit_9() {
	return Submit_9;
}
@FindBy(id="hotels")
private WebElement hotel_2;
@FindBy(id="room_type")
private WebElement roomType_3;
@FindBy(id="room_nos")
private WebElement roomNo_4;
@FindBy(id="datepick_in")
private WebElement checkIn_5;
@FindBy(id="datepick_out")
private WebElement checkOut_6;
@FindBy(id="adult_room")
private WebElement adultRoom_7;
@FindBy(id="child_room")
private WebElement childRoom_8;
@FindBy(id="Submit")
private WebElement Submit_9;
}
