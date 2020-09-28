package com.wordpress.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wordpress.qa.base.BasePage;

public class LoginPage extends BasePage {

//	@FindBy(xpath="//a[contains(text(),'Sign In')]")
//	WebElement LogIn;
	
	//@FindBy(linkText="Sign In")
	//WebElement LogIn;
	
	@FindBy(id="usernameOrEmail")
	WebElement EmailOrUser;

	@FindBy(xpath="//button[@class='button form-button is-primary']")
	WebElement Continue;

	@FindBy(id="password")
	WebElement Password;

	@FindBy(xpath="//button[@class='button form-button is-primary']")
	WebElement Submit;

	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}

//	public void StartBlog() {
//		LogIn.click();
//	}

	public String EmailAddress(String email) {
		EmailOrUser.sendKeys(email);
		return email;
	}

	public void Continue() {
		Continue.click();
		}

	public String EmailPwd(String pwd) {
		Password.sendKeys(pwd);
		return pwd;
	}

	public void CreateAcc() {
		Submit.click();}
}
