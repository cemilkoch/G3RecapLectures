package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_21_WebTableHandling_3 {

	public static void main(String[] args) {
		
		//table[@id='customers']/tbody/tr[1]/th[1]
		//table[@id='customers']/tbody/tr[1]/th[2]
		//table[@id='customers']/tbody/tr[1]/th[3]
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[1]/th[";
		String afterXpath = "]";
		
		System.out.println("Column values :: ");
		for (int i = 1; i < 4 ; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		
		for (int i = 1; i <= columns.size(); i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		driver.quit();
		
	}

}
