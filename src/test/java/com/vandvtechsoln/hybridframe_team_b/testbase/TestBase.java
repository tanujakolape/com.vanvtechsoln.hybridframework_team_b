package com.vandvtechsoln.hybridframe_team_b.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver = null;

	@BeforeSuite
	public void init() {

	}

	@BeforeMethod
	@Parameters({"browser","url"})
	
public void setUp(@Optional("Chrome")String browser,@Optional("https://demo.guru99.com/V4/")String url) 
	
	{
		
		if (browser.equals("Chrome")) {
			// System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		/*else if(browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new IEDriver();
		}*/

		else {
			System.out.println("Browser not matched");
		}
		driver.manage().window().maximize();
		//driver.get(url);
		driver.get("https://demo.guru99.com/V4/");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
