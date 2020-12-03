package com.herokuapp.theinternet.loginpagetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecurePage {

	WebDriver driver;

	// Create constructor
	public SecurePage(WebDriver driverShared) {
		this.driver = driverShared;
	}
	
	public void logOut() {	
		WebElement logOutButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		logOutButton.click();
	}	
		
	public String getMessage() {	
		WebElement message = driver.findElement(By.id("flash-messages")); 
		String actualMessage = message.getText(); 
		return actualMessage;
		
	}	 


}
