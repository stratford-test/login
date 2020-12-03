package com.herokuapp.theinternet.loginpagetest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.loginpagetest.pages.LoginPage;
import com.herokuapp.theinternet.loginpagetest.pages.SecurePage;
import com.herokuapp.theinternet.loginpagetest.pages.WelcomePage;

public class PositiveloginTest extends BaseTest {

	@Parameters({ "url", "username", "password", "expectedMessage" })
	@Test
	public void login(String url, String username, String password, String expectedMessage) {
		WelcomePage welcomepage = new WelcomePage(driver);
		welcomepage.clickFormAuthentication();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);

		SecurePage securePage = new SecurePage(driver);
		String actualMessage = securePage.getMessage();
		Assert.assertTrue(actualMessage.contains(expectedMessage), "it is not true as :" + actualMessage);
		securePage.logOut();

	}

}
