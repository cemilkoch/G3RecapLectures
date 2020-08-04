package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_32_SliderHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/#rangemax");

		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());

		driver.switchTo().frame(0);

		WebElement element = driver.findElement(By.xpath("//span[@tabindex='0']"));

		Actions actions = new Actions(driver);

		// actions.clickAndHold(element).moveByOffset(150, 0).perform();

		actions.dragAndDropBy(element, 150, 0).perform();
		actions.dragAndDropBy(element, -100, 0).perform();

	}

}
