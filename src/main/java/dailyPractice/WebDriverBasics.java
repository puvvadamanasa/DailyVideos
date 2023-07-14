package dailyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class WebDriverBasics {
	static WebDriver driver;
	public static void main(String[] args) {
		String browserName="chrome";
		if(browserName.equals("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please pass right Browser");
		}
		driver.get("https://amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Amazon")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("amazon")){
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		driver.close();
		//driver.quit();
	
		
		
	}

}
