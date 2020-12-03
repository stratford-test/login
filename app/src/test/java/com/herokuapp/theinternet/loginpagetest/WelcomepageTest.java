package com.herokuapp.theinternet.loginpagetest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WelcomepageTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		

	}
@Test
	public void ClickFormAuthenticationLink() {
		WebElement FormAuthenticationLink = driver.findElement(By.linkText("Form Authentication"));
		FormAuthenticationLink.click();
		String expectedURL = "https://the-internet.herokuapp.com/login";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL, "they are not same");
	}

}
