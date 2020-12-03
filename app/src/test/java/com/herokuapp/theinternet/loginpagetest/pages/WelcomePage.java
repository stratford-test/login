package com.herokuapp.theinternet.loginpagetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	WebDriver driver;
	
	@FindBy(linkText="Form Authentication")
	WebElement formAuthentication;
	
	
	//Create constructor
	public WelcomePage(WebDriver driverShared) {
		this.driver = driverShared;	
		PageFactory.initElements(driver, this);
	}
	
	public void clickFormAuthentication() {
		//formAuthentication = driver.findElement(By.linkText("Form Authentication"));
		formAuthentication.click();
	}
	
}