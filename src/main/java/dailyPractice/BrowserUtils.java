package dailyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtils {
	private WebDriver driver;
	public WebDriver initDriver(String browserName) {
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass right browser"+browserName);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	public void launchURL(String url) {
		driver.get(url);
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
