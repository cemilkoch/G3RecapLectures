package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_23_ExplicitlyWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing2");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()= 'Try it']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		By seconds = By.xpath("//p[text()='6 seconds']");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(seconds));
		
		String text = driver.findElement(seconds).getText();
		System.out.println(text);
		
		boolean status = driver.findElement(seconds).isDisplayed();
		
		System.out.println(status);
		
		driver.quit();
		
		

	}

}
