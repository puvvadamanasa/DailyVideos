package dailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLang {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> list =driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']"));
		System.out.println(list.size());
		for(WebElement e:list) {
			String text = e.getText();
			//System.out.println(text);
			if(text.length()>0) {
				System.out.println(text);
			}
			if(text.equals("selenium")) {
				e.click();
				break;
			
			}
			
		}
		 

	}

}
