package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lib.TestBase;
import com.page.HomePage;
import com.page.LoginPage;

public class TestLogin  extends TestBase{
	
	public LoginPage loginPage;
	public HomePage homePage;

	public  TestLogin()
			{
		super();
			}
	
	@BeforeMethod
	public void setup()
	{
		initialzation();
		loginPage = new LoginPage();
		
	}

	@Test(priority=1)
	public void loginPageTest()
	{
		String title =loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Facebook - log in or sign up");
	}
	
	@Test(priority=2)
	public void LoginTest()
	{
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
}
