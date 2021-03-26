package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.pom.org.PomForLoginpage;

public class PageObjectManager {
public static WebDriver driver;
	
private PomForLoginpage lp;

	public PageObjectManager(WebDriver lhdriver) {
		this.driver=lhdriver;
	}

	
	public PomForLoginpage getLp() {
		lp=new PomForLoginpage(driver);
		return lp;
	}
	
	
}
