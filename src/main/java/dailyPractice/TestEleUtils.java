package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestEleUtils {

	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtils b = new BrowserUtils();
		WebDriver driver = b.initDriver(browserName);
		b.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = b.getPageTitle();
		ElementUtils e = new ElementUtils(driver);
		By fname = By.id("input-firstname");
		e.getElement(fname);
		e.doSendKeys(fname,"mansa");

	}

}
