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
import com.wordpress.qa.pages.LoginPage;
import com.wordpress.qa.pages.SignupPage;

public class LoginPageTest extends BasePage{

	public static Logger log=LogManager.getLogger(BasePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
	}

	@Test
	public void wordpressTest2() throws InterruptedException {
		LoginPage lp2= new LoginPage();
		Thread.sleep(1000);
		lp2.EmailAddress("wordpressautomation@gmail.com");
		Thread.sleep(1000);
		lp2.Continue();
		lp2.EmailPwd("word@1234");
		lp2.CreateAcc();

		//log.debug("window is maximized");
	}

}
