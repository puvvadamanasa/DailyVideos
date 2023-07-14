package dailyPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(3000);
		Set<String> whid = driver.getWindowHandles();
		System.out.println(whid);//set will not maintain order
		//it cannot have duplicate values 
		Iterator<String> it = whid.iterator();
		String pwid = it.next();
		System.out.println(pwid);
		String cwid = it.next();
		System.out.println(cwid);
		driver.switchTo().window(cwid);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(pwid);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
