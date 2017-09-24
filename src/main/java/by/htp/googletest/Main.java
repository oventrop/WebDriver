package by.htp.googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		MainPage main = new MainPage(driver);
		main.open();
		main.loginToMail();
		
		UserMailBox box= new UserMailBox(driver);
		box.writeNewLetter();
		
		WriteNewLetter letter = new WriteNewLetter(driver);
		letter.fillLetter();
	}

}
