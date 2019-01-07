package Rediff.com_TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Rediff.com_ObjectRepository.LoginPage;

public class LoginPageTestCase {
	
	@Test
	public void loginTest() {
		
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		
		LoginPage obj=new LoginPage(driver);
		
		obj.linkSignIn().click();
		
		obj.userId().sendKeys("I'm username");
		obj.passKey().sendKeys("I'm Pass");
		
		obj.clickGo().click();
	}

}
