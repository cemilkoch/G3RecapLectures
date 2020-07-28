package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_27_AuthenticationPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// https://username:password@WebsiteURL

//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String user = "admin";
		String pass = "admin";

		driver.get("https://" + user + ":" + pass + "@the-internet.herokuapp.com/basic_auth");

	}

}
