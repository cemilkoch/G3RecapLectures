package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_22_WebTableHandling_4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpathCompany = "]/td[1]";
		String afterXpathContact = "]/td[2]";
		String afterXpathCountry = "]/td[3]";
		
		

	}
	
	public static int tableCount(WebDriver driver) {
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		return rowList.size();
	}
	

}
