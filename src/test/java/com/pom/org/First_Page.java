package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Page {

	public static WebDriver driver;


	@FindBy(id="username")
	private WebElement user;

	

	@FindBy(id="password")
	private WebElement pass;

	@FindBy(id="login")
	private WebElement login;
	
	
	public First_Page(WebDriver idriver) {
		this.driver=idriver;
		PageFactory.initElements(driver, this);
		
		}
	public WebElement getUser() {
		return user;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}

}
