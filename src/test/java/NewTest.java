import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;

	@BeforeClass
	public void initDriver() {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	@Test
	public void openMail() {

		driver.get("http://www.mail.ru");

		WebElement login = driver.findElement(By.name("Login"));
		login.click();
		login.sendKeys("tathtp");

		WebElement pass = driver.findElement(By.name("Password"));
		pass.click();
		pass.sendKeys("Klopik123");

		WebElement submit = driver.findElement(By.id("mailbox__auth__button"));
		submit.click();

		new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfElementLocated(By.id("b-toolbar__left")));
		assertNotNull(driver.findElement(By.id("b-toolbar__left")), "Didnt login");

	}

	@AfterClass
	public void destroyBrowser() {
		driver.quit();
	}
}
