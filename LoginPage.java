package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.TestBase;

public class LoginPage extends TestBase{

	//pagefactory OR object repo
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement Loginbutton;
	
	@FindBy(xpath="//a[contains(text(),'open-registration-form-button')]")
	WebElement CreateAccount;
	
	//Initializing the page object 
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Action 
	public String  validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean ValidateEmail()
	{
		return email.isDisplayed();
	}
	
	public HomePage login(String un , String pw)
	
	{
		email.sendKeys(un);
		password.sendKeys(pw);
		Loginbutton.click();
		
		return new HomePage();
	}
}

