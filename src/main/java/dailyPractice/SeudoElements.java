package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeudoElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fn =    driver.findElement(By.id("input-firstname"));
		fn.sendKeys("kdj");
		String name = fn.getAttribute("value");
		System.out.println(name);
		WebElement ln =    driver.findElement(By.id("input-lastname"));
		ln.sendKeys(null);//illegal argument exception
		

	}

}
