package com.wordpress.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wordpress.qa.base.BasePage;

public class LandingPage extends BasePage {

	@FindBy(xpath="//a[@class='masterbar__item masterbar__item-new']")
	WebElement Write;
	
	@FindBy(css="textarea#post-title-0.editor-post-title__input")
	WebElement AddTitle;

	@FindBy(xpath="//*[@id=\"block-fbf1e122-75f2-4a19-85dc-1f4343016911\"]/span")
	WebElement StartWriting;

	public LandingPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void WriteIcon() {
		Write.click();
	}

	public String AddTitle(String title) {
		AddTitle.sendKeys(title);
		return title;
		}

	public String StartWriting(String writing) {
		StartWriting.click();
		StartWriting.sendKeys(writing);
		return writing;
	}

}