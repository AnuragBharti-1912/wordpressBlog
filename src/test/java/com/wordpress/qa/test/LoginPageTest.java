package com.wordpress.qa.test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wordpress.qa.base.BasePage;
import com.wordpress.qa.pages.LoginPage;

public class LoginPageTest extends BasePage{

	public static Logger log=LogManager.getLogger(BasePage.class.getName());

	@BeforeSuite
	public void initialize() throws IOException{
		driver=initializeDriver();
	}

	@Test
	public void wordpressTest2() throws InterruptedException {
		LoginPage lp2= new LoginPage();
		Thread.sleep(1000);
		lp2.EmailAddress(prop.getProperty("email"));
		log.info("email entered");
		Thread.sleep(1000);
		lp2.Continue();
		Thread.sleep(1000);
		lp2.EmailPwd(prop.getProperty("pwd"));
		log.info("password entered");
		Thread.sleep(1000);
		lp2.CreateAcc();
		Thread.sleep(1000);


	}

}
