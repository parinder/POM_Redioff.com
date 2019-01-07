package Rediff.com_ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {

		this.driver = driver; // make it local
	}

	By setAsHomepage = By.linkText("Set as homepage");
	By signIn = By.linkText("Sign in");
	By createAccount = By.linkText("Create a Rediffmail account");
	By homeLink = By.xpath("//div[contains(text(),'Home')]");
	By cricLink = By.xpath("//div[contains(text(),'Cricket')]");

	public WebElement selectHompage() {

		return driver.findElement(setAsHomepage);
	}

	public WebElement linkSignIn() {

		return driver.findElement(signIn);
	}

	public WebElement register() {

		return driver.findElement(createAccount);
	}

	public WebElement linkHome() {

		return driver.findElement(homeLink);
	}

	public WebElement Cricket() {

		return driver.findElement(cricLink);
	}

}
