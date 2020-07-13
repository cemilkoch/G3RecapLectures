package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_20_WebTableHandling_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Rows in the table: " + rows.size());
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for (int i = 2; i <= rows.size() ; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			//System.out.println(element.getText());
			if (element.getText().equals("Ernst Handel")) {
				System.out.println("Company name is found at position " + (i-1));
				break;
			}
			
		}
		

	}

}
