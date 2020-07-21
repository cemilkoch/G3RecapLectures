package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_26_FileUploading {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/upload/");

		WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));

		fileUpload.sendKeys("/Users/cemilkoc/Desktop/Screen Shot 2020-06-22 at 4.44.46 AM.png");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("submitbutton")).click();

		driver.quit();

	}

}
