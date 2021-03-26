package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecting_Hotel {
	
public static WebDriver driver;
	
	
	@FindBy(id="radiobutton_0")
private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continue_btn;
	
	public Selecting_Hotel(WebDriver driverm) {
this.driver=driverm;
PageFactory.initElements(driver, this);
	
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	
}
}