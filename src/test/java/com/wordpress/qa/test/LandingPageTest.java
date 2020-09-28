package com.wordpress.qa.test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import com.wordpress.qa.base.BasePage;
import com.wordpress.qa.pages.LandingPage;

public class LandingPageTest extends BasePage{

	public static Logger log=LogManager.getLogger(BasePage.class.getName());

	@Test
	public void wordpressTest2() throws InterruptedException {
		LandingPage lp3= new LandingPage(driver);
		lp3.WriteIcon();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"primary\"]/div[2]/iframe"));
		
		String ActualTitle = "New Post ‹ UiAutomation — WordPress.com";
		String ExpectedTitle = driver.getTitle();

		Assert.assertEquals(ActualTitle, ExpectedTitle);
		log.debug("title is matched");

		
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		log.info("iframe is switched");

		lp3.AddTitle(prop.getProperty("title"));
		Thread.sleep(2000);

		lp3.StartWriting(prop.getProperty("startWriting"));
		
	}

	@AfterSuite
	public void teardown() {
		driver.close();
		driver=null; }

}
