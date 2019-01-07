package Rediff.com_TestCases;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Rediff.com_ObjectRepository.Homepage_POF;

public class HompageTestCase_POF {

	@Test
	public void homeTest() {

		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");

		Homepage_POF homeObj = new Homepage_POF(driver); //Create object for hit the arguement of Homepage class's constructor
		homeObj.selectHompage().click();
		driver.switchTo().alert().accept();

		homeObj.linkSignIn().click();
		driver.navigate().back();

		homeObj.register().click();
		driver.navigate().back();

		homeObj.linkHome().click();

		homeObj.Cricket().click();
		
		//driver.quit();
	}

}
