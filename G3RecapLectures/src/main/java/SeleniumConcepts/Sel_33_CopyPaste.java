package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_33_CopyPaste {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");

		WebElement name = driver.findElement(By.id("u_0_m"));
		WebElement lastName = driver.findElement(By.id("u_0_o"));

		Actions actions = new Actions(driver);

		actions.click(name).sendKeys("Cemil").perform();

		// MAC COMMAND + A | WINDOWS CONTROL + A to select everything
		actions.keyDown(name, Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();

		// MAC COMMAND + C | to copy
		actions.keyDown(Keys.COMMAND).sendKeys("C").keyUp(lastName, Keys.COMMAND).perform();

		// MAC COMMAND + V | To paste
		actions.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();

	}

}
