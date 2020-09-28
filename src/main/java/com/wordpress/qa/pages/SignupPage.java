package com.wordpress.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.BasePage;

public class SignupPage extends BasePage {

	@FindBy(xpath="//a[@id='lpc-button']")
	WebElement Start;

	@FindBy(id="email")
	WebElement Email;

	@FindBy(id="username")
	WebElement Username;

	@FindBy(id="password")
	WebElement Password;

	@FindBy(xpath="//button[@class='button signup-form__submit form-button is-primary']")
	WebElement Create;

	public SignupPage() 
	{
		PageFactory.initElements(driver, this);
	}

	public void StartBlog() {
		Start.click();
	}

	public String EmailAddress(String email) {
		Email.sendKeys(email);
		return email;
	}

	public String Username(String user) {
		Username.sendKeys(user);
		return user;
	}

	public String EmailPwd(String pwd) {
		Password.sendKeys(pwd);
		return pwd;
	}

	public void CreateAcc() {
		Create.click();}
}
