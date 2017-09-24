package by.htp.googletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMailBox extends Page {

	public UserMailBox(WebDriver driver) {
		super(driver);

	}

	public void writeNewLetter() {
		new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfElementLocated(By.id("b-toolbar__left")));
		WebElement newletter = driver.findElement(By.id("b-toolbar__left"));
		newletter.click();
	}
}
