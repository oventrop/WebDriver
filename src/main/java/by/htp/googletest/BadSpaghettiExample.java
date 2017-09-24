package by.htp.googletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BadSpaghettiExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
		WebElement newletter = driver.findElement(By.id("b-toolbar__left"));
		newletter.click();
		new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div/div/textarea[2]")));
		WebElement to = driver.findElement(By.xpath("//textarea[2]"));
		to.click();
		to.sendKeys("sviatlana.zakharenka@gmail.com");
		WebElement subj = driver.findElement(By.xpath("//*/div[1]/div/div[3]/div[4]/div/div/div[2]/div/input"));

		subj.sendKeys("AutoTest");
		driver.switchTo().frame(driver.findElement(By.xpath(".//tr[@class='mceFirst mceLast']//iframe")));
		driver.findElement(By.id("tinymce")).click();
		driver.findElement(By.id("tinymce")).sendKeys("Hi!");
		driver.switchTo().defaultContent();
		// WebElement send =
		// driver.findElement(By.xpath("//*/div[3]/div/div[2]/div[1]/div/span"));
		// send.click();

	}
}