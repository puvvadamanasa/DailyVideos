package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorCon2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement ele = driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		driver.findElement(with(By.id("input-email")).below(ele)).sendKeys("sdfs");
		String text = driver.findElement(with(By.tagName("h2")).near(ele)).getText();
		System.out.println(text);

	}

}
