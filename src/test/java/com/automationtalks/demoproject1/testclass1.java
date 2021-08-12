package com.automationtalks.demoproject1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class testclass1 {

	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\source\\repos\\selium\\packages\\Selenium.WebDriver.ChromeDriver.92.0.4515.4300\\driver\\win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();
	}
	@Test
	public void test1() {
		
		driver.navigate().to("http://tltechco.com/index.php/en/");
		System.out.println("Test 1 tile is"+driver.getTitle());
	}
	@Test
	public void Test2() {
		
		driver.navigate().to("http://tltechco.com/index.php/en/");
		System.out.println("Test 2 tile is"+driver.getTitle());
	}
	@AfterMethod
	public void quit() {
		driver.quit();
		
	}
}
