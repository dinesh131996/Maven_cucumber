package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tpersonal_Details {
	
	
		public static WebDriver driver;
		
		public Tpersonal_Details(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);

		}

		@FindBy(id="first_name")
		private WebElement firstname;
		
		@FindBy(id="last_name")
		private WebElement lastname;
		@FindBy(id="address")
		private WebElement address;
		@FindBy(id="cc_num")
		private WebElement cardNo;
		@FindBy(id="cc_type")
		private WebElement ccType;
		@FindBy(id="cc_exp_month")
		private WebElement expiryMonth;
		@FindBy(id="cc_exp_year")
		private WebElement expiryYear;
		
		@FindBy(id="cc_cvv")
		private WebElement ccv;
		
		@FindBy(id="book_now")
		private WebElement bookNow;
		
		public static WebDriver getDriver() {
			return driver;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCardNo() {
			return cardNo;
		}

		public WebElement getCcType() {
			return ccType;
		}

		public WebElement getExpiryMonth() {
			return expiryMonth;
		}

		public WebElement getExpiryYear() {
			return expiryYear;
		}

		public WebElement getCcv() {
			return ccv;
		}

		public WebElement getBookNow() {
			return bookNow;
		}
}
