package com.cucumber.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.org.Base_class;
import com.cucumber.helper.Filemanageer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\cucumber.feature",

/*"C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\CucuTags.feature",
{"C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\CucuBackground.feature","C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\Cucu.feature",
		"C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\CucuLis.feature","C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\CucuMa.feature",
		"C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\feature\\CucuScenarioOutline.feature"}, 
*/
glue = "com\\cucumber\\stepdefinition", 
monochrome = true
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Cucureport/Report.html","json:jsonoutput/hello.json"}

)
public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		// TODO Auto-generated method stub
//String brow = Filemanageer.instance().config().brow();
	//	driver = Base_class.browser("chrome");
		String brow = Filemanageer.instance().config().brow();
	driver= Base_class.browser(brow);
	
	String brow2 = Filemanageer.instance().config().brow();
	driver=Base_class.browser(brow2);
	
	
	}

	@AfterClass
	public static void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	
}