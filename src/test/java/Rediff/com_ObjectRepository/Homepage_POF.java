package Rediff.com_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_POF {
	WebDriver driver;

	public Homepage_POF(WebDriver driver) {

		this.driver = driver; // make it local

		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Set as homepage")
	WebElement setAsHomepage;

	@FindBy(linkText = "Sign in")
	WebElement signIn;

	@FindBy(linkText = "Create a Rediffmail account")
	WebElement createAccount;

	@FindBy(xpath = "//div[contains(text(),'Home')]")
	WebElement homeLink;

	@FindBy(xpath = "//div[contains(text(),'Cricket')]")
	WebElement cricLink;

	public WebElement selectHompage() {

		return setAsHomepage;
	}

	public WebElement linkSignIn() {

		return signIn;
	}

	public WebElement register() {

		return createAccount;
	}

	public WebElement linkHome() {

		return homeLink;
	}

	public WebElement Cricket() {

		return cricLink;
	}

}
