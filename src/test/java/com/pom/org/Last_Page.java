package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Last_Page {
public static WebDriver driver;


	public Last_Page(WebDriver driverm) {
		this.driver=driverm;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="my_itinerary")
	private WebElement myLiteracy;
	@FindBy(id="check_all")
	private WebElement selectAll;
	@FindBy(id="logout")
	private WebElement logout;
	public WebElement getMyLiteracy() {
		return myLiteracy;
	}
	public WebElement getSelectAll() {
		return selectAll;
	}
	public WebElement getLogout() {
		return logout;
	}
}
