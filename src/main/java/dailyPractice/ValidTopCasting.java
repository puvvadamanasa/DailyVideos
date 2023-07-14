package dailyPractice;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ValidTopCasting {

	public static void main(String[] args) {
		//valid but not recommendded
		SearchContext s = new ChromeDriver();
		s.findElement(null);
		s.findElements(null);
		WebDriver driver = new ChromeDriver();
		RemoteWebDriver drive = new ChromeDriver();
		ChromeDriver d = new ChromeDriver();
		WebDriver s1 = new RemoteWebDriver(null);
		ChromiumDriver fg = new ChromeDriver();
		//not recommended
		SearchContext sc = new RemoteWebDriver(null);
		
	
		
		

	}

}
