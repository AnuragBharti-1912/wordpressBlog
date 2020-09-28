package com.wordpress.qa.test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wordpress.qa.base.BasePage;
import com.wordpress.qa.pages.SignupPage;

public class SignupPageTest extends BasePage{

	public static Logger log=LogManager.getLogger(BasePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
	}

	@Test
	public void wordpressTest() throws InterruptedException {
		SignupPage lp= new SignupPage();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(2000);

		lp.StartBlog();
		Thread.sleep(1000);
		lp.EmailAddress("anuragolu1991@gmail.com");
		Thread.sleep(1000);

		lp.Username("anuragolu");
		Thread.sleep(1000);

		lp.EmailPwd("@sadhna00");
		Thread.sleep(1000);

		lp.CreateAcc();

		log.debug("window is maximized");
	}

}
