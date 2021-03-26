package com.cucumber.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.org.First_Page;
import com.pom.org.Last_Page;
import com.pom.org.Search_Hotell;
import com.pom.org.Selecting_Hotel;
import com.pom.org.Tpersonal_Details;

public class Page_Object_Manager {
 
	public static WebDriver driver;
	
	
	private First_Page f;
	private Search_Hotell sh;
	private Selecting_Hotel ssh;
	private Tpersonal_Details pd;
	public Tpersonal_Details getPd() {
		pd= new Tpersonal_Details(driver);
		return pd;
	}
	public Last_Page getLp() {
		lp= new Last_Page(driver);
		return lp;
	}
	private Last_Page lp;
	public Selecting_Hotel getSsh() {
		ssh= new Selecting_Hotel(driver);
		return ssh;
	}
	public Search_Hotell getSh() {
		sh=new Search_Hotell(driver);
		return sh;
	}
	public First_Page getF() {
		f=new First_Page(driver);
		//f.getUser();
		return f;
	}
	public Page_Object_Manager(WebDriver mdriver) {
        this.driver=mdriver;
	}
	
	
	
}
