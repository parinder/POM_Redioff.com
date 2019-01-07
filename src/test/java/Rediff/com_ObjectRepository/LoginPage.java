package Rediff.com_ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By signIn = By.linkText("Sign in");
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By Login = By.name("proceed");

	public WebElement linkSignIn() {

		return driver.findElement(signIn);
	}

	public WebElement userId() {
		return driver.findElement(username);
	}

	public WebElement passKey() {
		return driver.findElement(password);
	}

	public WebElement clickGo() {
		return driver.findElement(Login);
	}

}
