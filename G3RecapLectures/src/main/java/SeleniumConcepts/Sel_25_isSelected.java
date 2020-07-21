package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_25_isSelected {

	public static void main(String[] args) {

		// isSelected() method is used to verify if the web element is selected or not
		// isSelected() method is used commonly with radio buttons, checkboxes, and dropdowns
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");

		WebElement element = driver.findElement(By.id("vfb-7-1"));

		element.click();
		System.out.println("Radio Button Option 1 selected is : " + element.isSelected());

		WebElement element2 = driver.findElement(By.id("vfb-7-2"));
		element2.click();
		System.out.println("Radio Button Option 2 selected is : " + element2.isSelected());
		System.out.println("Radio Button Option 1 selected is : " + element.isSelected());
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		
		if (option1.isSelected())
			System.out.println("Checkbox is selected");
		else
			System.out.println("Checkbox is not selected");
		
		driver.quit();

	}

}
