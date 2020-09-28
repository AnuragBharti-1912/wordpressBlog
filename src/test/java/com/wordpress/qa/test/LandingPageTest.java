package com.wordpress.qa.test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wordpress.qa.base.BasePage;
import com.wordpress.qa.pages.LandingPage;
import com.wordpress.qa.pages.LoginPage;
import com.wordpress.qa.pages.SignupPage;

public class LandingPageTest extends BasePage{

	public static Logger log=LogManager.getLogger(BasePage.class.getName());

	/*
	 * @BeforeTest public void initialize() throws IOException{
	 * driver=initializeDriver(); }
	 */

	
	@Test
	public void wordpressTest2() throws InterruptedException {
		LandingPage lp3= new LandingPage(driver);
		lp3.WriteIcon();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"primary\"]/div[2]/iframe"));
		
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		lp3.AddTitle("UIAutomation");
		Thread.sleep(2000);

		lp3.StartWriting("I am writing first blog");

		log.debug("window is maximized");
		
	}


	/*
	 * @AfterTest public void teardown() { driver.close(); driver=null; }
	 */
}
