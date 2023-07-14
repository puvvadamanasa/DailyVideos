package dailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalParagraph {

	public static void main(String[] args) {
		BrowserUtils b = new BrowserUtils();
		WebDriver driver = b.initDriver("chrome");
		b.launchURL("https://classic.crmpro.com/");
		ElementUtils u = new ElementUtils(driver);
		By para = By.tagName("p");
		List<WebElement> l = driver.findElements(para);
		System.out.println(l.size());
		for(WebElement l1:l) {
			System.out.println(l1.getText());
		}

	}

}
