package com.cucumber.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Filemanageer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\Cucu.feature",
glue = "com\\cucumber\\stepdefinition"
		)

public class Runner1 {
	public static WebDriver driver;
@BeforeClass
public static void launch() throws IOException {
	// TODO Auto-generated method stub
String brow = Filemanageer.instance().config().brow();
driver=Base_class.browser(brow);
}
@AfterClass
public static void tearDown() {
	// TODO Auto-generated method stub
driver.quit();
}
}
