package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sel_14_DropDown_1 {

	static WebDriver driver;
	static WebElement element;
	static By dropDown = By.id("testingDropdown"); 
	static String url = "https://www.testandquiz.com/selenium/testing.html";
	
	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, url);
		
		element = ElementUtil.getElement(driver, dropDown);
		
//		Select select = new Select(element);
//		select.selectByVisibleText("Database Testing");
//		
//		if(select.getFirstSelectedOption().getText().equals("Database Testing")){
//			System.out.println("Correct selection");
//		}else {
//			System.out.println("Incorrect selection");
//		}
		selectByIndex(driver, dropDown, 3, "Database Testing");
		
		
	}
	
	static void selectByIndex(WebDriver driver, By locator, int index, String text) {
		WebElement element = ElementUtil.getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
		if (select.getFirstSelectedOption().getText().equals(text)) {
			System.out.println("Correct selection");
		}else {
			System.out.println("Incorrect Selection");
		}
		
	}
	
	

}
