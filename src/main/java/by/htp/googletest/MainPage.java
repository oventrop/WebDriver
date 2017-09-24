package by.htp.googletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page {
	private final String URL = "https://mail.ru";
	private final By loginLocator = By.id("mailbox__login");
	private final By passLocator = By.id("mailbox__password");
	private final By submitLocator = By.id("mailbox__auth__button");
	private final String USER_NAME = "tathtp";
	private final String USER_PASS = "Klopik123";

	public MainPage(WebDriver driver) {
		super(driver);

	}

	public void open() {
		getDriver().get(URL);
	}

	public void loginToMail() {
		WebElement loginField = getDriver().findElement(loginLocator);
		loginField.click();
		loginField.sendKeys(USER_NAME);
		WebElement passField = getDriver().findElement(passLocator);
		passField.click();
		passField.sendKeys(USER_PASS);
		WebElement enter = getDriver().findElement(submitLocator);
		enter.click();
	}
}
