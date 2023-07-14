package dailyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();
		//driver = new ChromeDriver();
	    //driver = new ChromeDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		//driver.getTitle();//session id becomes null
		driver.close();//session id becomes invalid
		driver.getTitle();
		

	}

}
