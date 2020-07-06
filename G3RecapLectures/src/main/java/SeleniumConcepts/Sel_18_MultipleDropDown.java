package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sel_18_MultipleDropDown {

	static By dropDown = By.id("countriesMultiple");
	static By multipleDropDown = By.xpath("//select[@id='countriesMultiple']/option");
	static WebDriver driver;
	static String url = "http://uitestpractice.com/Students/Select";
	
	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, url);
		
		WebElement element = ElementUtil.getElement(driver, dropDown);
		Select select = new Select(element);
		System.out.println(select.isMultiple());
		
		List<WebElement> dropList = driver.findElements(multipleDropDown);
		System.out.println(dropList.size());
		
		Select select2 = new Select(element);
		
		for (int i = 0; i < dropList.size(); i++) {
			select2.selectByIndex(i);
		}
		
		
		
	}

}
