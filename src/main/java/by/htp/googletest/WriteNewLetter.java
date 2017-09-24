package by.htp.googletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WriteNewLetter extends Page {

	public WriteNewLetter(WebDriver driver) {
		super(driver);

	}

	public void fillLetter() {
		WebElement to = getDriver().findElement(By.xpath("//textarea[2]"));
		to.click();
		to.sendKeys("sviatlana.zakharenka@gmail.com");

		WebElement subj = getDriver().findElement(By.xpath("//*/div[1]/div/div[3]/div[4]/div/div/div[2]/div/input"));
		subj.sendKeys("AutoTest");

		getDriver().switchTo().frame(driver.findElement(By.xpath(".//tr[@class='mceFirst mceLast']//iframe")));
		WebElement mainText = getDriver().findElement(By.id("tinymce"));
		mainText.clear();
		mainText.click();
		mainText.sendKeys("Hi! Testing WebDriver!");
		getDriver().switchTo().defaultContent();

	}

	public void sendFilledLetter() {
		WebElement send = getDriver().findElement(By.xpath("//*/div[3]/div/div[2]/div[1]/div/span"));
		send.click();
	}

}
