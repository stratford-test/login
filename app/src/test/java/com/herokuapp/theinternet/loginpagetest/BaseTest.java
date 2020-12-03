package com.herokuapp.theinternet.loginpagetest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;

	
	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void setUp(@Optional("chrome") String browser, String url) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "Ipad":
			Map<String, String> mobileEmulationIpad = new HashMap<>();
			mobileEmulationIpad.put("deviceName", "iPad");
			ChromeOptions chromeOptionsIpad = new ChromeOptions();
			chromeOptionsIpad.setExperimentalOption("mobileEmulation", mobileEmulationIpad);
			driver = new ChromeDriver(chromeOptionsIpad);
			break;
		default:
			System.out.println("sout plus control space will do this ");
			System.out.println("I do not know what to do now so I will test in :" + browser + "starting ipad in chrome instead");
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		driver.get(url);
	}
	@AfterMethod
	public void cleanUp() {
		//driver.quit();
	}

}
