package com.base.org;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Base_class {
	public static WebDriver driver;
	public static WebElement element;
	public static String value;

	public static void clea(WebElement element) {
		element.clear();
	}

	public static void waitt() {

WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	// 1.browser
	public static WebDriver browser(String name) {
		try {
			if (name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (name.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("invalid browser");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not a vaid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	// 2.get
	public static void get_url(String url) {
		driver.get(url);
	}

	// 3.send keys
	public static void send_keys(String input, String attribute, String att_value) {
		if (input.equalsIgnoreCase("id")) {
			driver.findElement(By.id(attribute)).sendKeys(att_value);
		} else if (input.equalsIgnoreCase("name")) {
			driver.findElement(By.name(att_value)).sendKeys(att_value);
		} else if (input.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(attribute)).sendKeys(att_value);
		} else if (input.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(attribute)).sendKeys(att_value);
		} else if (input.equalsIgnoreCase("linkText")) {
			driver.findElement(By.linkText(attribute)).sendKeys(att_value);
		} else {
			System.out.println("Give the valid locator");
		}
	}

	public static void send(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clic(WebElement element) {
		element.click();
	}

	// 4.Navigation
	public static void navigation(String input, String url) {
		if (input.equalsIgnoreCase("to")) {
			driver.navigate().to(url);
		} else if (input.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (input.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else if (input.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}
	}

	// 5.click
	public static void click(String input, String att_value) {
		if (input.equalsIgnoreCase("id")) {
			driver.findElement(By.id(att_value)).click();
		} else if (input.equalsIgnoreCase("name")) {
			driver.findElement(By.name(att_value)).click();
		} else if (input.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(att_value)).click();
		} else if (input.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(att_value)).click();
		} else {
			System.out.println("Give the valid locator");
		}

	}

	// 6.close
	public static void close() {
		driver.close();
	}

	// 7.quit
	public static void quit() {
		driver.quit();
	}

	// 8.alert
	public static void alert(String input, String value, String m) {
		Alert alert = driver.switchTo().alert();
		if (input.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (input.equalsIgnoreCase("accept_dismiss")) {
			if (value.equalsIgnoreCase("accept")) {
				alert.accept();
			} else {
				alert.dismiss();
			}

		} else if (input.equalsIgnoreCase("sendkey")) {
			alert.sendKeys(value);
			if (m.equalsIgnoreCase("accept")) {
				alert.accept();
			} else {
				alert.dismiss();
			}
		} else {
			System.out.println("Give the correct Alert");
		}
	}

	// 9.frame
	public static void frame(WebElement element, String i) {
		if (element.isEnabled()) {
			driver.switchTo().frame(element);
		} else if (!element.isEnabled()) {
			driver.switchTo().frame(Integer.parseInt(i));
			System.out.println("Dinesh");

		}

	}

	// 10.Actions
	public static void action_withoutElement(String input, String value_for_sendkey) {
		Actions a = new Actions(driver);
		if (input.equalsIgnoreCase("click")) {
			a.click().build().perform();
		} else if (input.equalsIgnoreCase("contextclick")) {
			a.contextClick().build().perform();
		} else if (input.equalsIgnoreCase("doubleclick")) {
			a.doubleClick().build().perform();
		} else if (input.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(value_for_sendkey).build().perform();
		} else {
			System.out.println("Give the valid actions command");
		}
	}

	public static void actions_element(String input, WebElement element, String value) {
		Actions a = new Actions(driver);
		if (input.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (input.equalsIgnoreCase("contextclick")) {
			a.contextClick(element).build().perform();
		} else if (input.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).build().perform();
		} else if (input.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(element, value).build().perform();
		} else if (input.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(element).build().perform();
		}
	}

	public static void drag_drop(WebElement element, WebElement element2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element2);
	}

	// 11.get title
	public static void get_title() {
		driver.getTitle();
	}

	// 12.current URL
	public static void get_current_url() {

		driver.getCurrentUrl();
	}

	// 14.web element
	public static WebElement webelements(String input, String value) {
		if (input.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(value));
		}
		if (input.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(value));
		}
		return element;

	}

	// 13. Dropdown select
	public static void selections(WebElement element, String attribute, String value) {

		Select s = new Select(element);

		if (attribute.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (attribute.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		} else if (attribute.equalsIgnoreCase("int")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else {
			System.out.println("Give the valid");
		}
	}

	// 14.clear
	public static void clearr(String input, String value) {
		if (input.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(value)).clear();
		} else if (input.equalsIgnoreCase("id")) {
			driver.findElement(By.id(value)).clear();
		} else if (input.equalsIgnoreCase("name")) {
			driver.findElement(By.name(value)).clear();
		} else if (input.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(value)).clear();
		}
	}

	// 15.wait pending
	public static void waitt(int input) {
		driver.manage().timeouts().implicitlyWait(input, TimeUnit.SECONDS);
	}

	// 16.window handle
	public static String window_handle() {
		value = driver.getWindowHandle();

		return value;
	}

	public static void window_handles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);
			System.out.println(driver.switchTo().window(string).getTitle());

		}
	}

	// 17.screenshot
	public static void screenshotts(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(value);
		Files.copy(source, destination);

	}
	
	//click
	public static void clickkk(WebElement element) {
		element.click();
	}
	
	
	

}
