package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
//		driver.findElement(By.id("input-email")).sendKeys("mail");
//		driver.findElement(By.id("input-password")).sendKeys("hai");
		
//		WebElement e1 = driver.findElement(By.id("input-email"));
//		WebElement e2 = driver.findElement(By.id("input-password"));
//		
//		e1.sendKeys("jkl");
//		e2.sendKeys("jsfd");
//		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		driver.findElement(email).sendKeys("sdjfh");
//		driver.findElement(pwd).sendKeys("sdjf");
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//	    getElement(email).sendKeys("jsd");
//		getElement(pwd).sendKeys("jkh");	
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		doSendKeys("pwd", email);
		doSendKeys("fjdsk", pwd);
	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	public static void doSendKeys(String value,By locator) {
		getElement(locator).sendKeys(value);
	}
}
