package com.herokuapp.theinternet.loginpagetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		WebDriver driver;
		
		@FindBy(id = "username")
		WebElement userName;
		
		@FindBy(id = "password")
		WebElement passwordElement;
		
		@FindBy(xpath = "//*[@id=\"login\"]/button")
		WebElement logInButton;
		
		//Create constructor
		public LoginPage(WebDriver driverShared) {
			this.driver = driverShared;
			PageFactory.initElements(driver, this);
		}
		
		public void login(String username, String password) {
			userName.sendKeys(username);
			passwordElement.sendKeys(password);
			logInButton.click();
		}
}
