package dailyPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String pwhid = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> iterator = handles.iterator();
		while(iterator.hasNext()) {
			String wh = iterator.next();
			Thread.sleep(3000);
			driver.switchTo().window(wh);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			if(!pwhid.equals(wh)){
				driver.close();
			}	
		}
		driver.switchTo().window(pwhid);
		System.out.println(driver.getCurrentUrl());
	

	}

}
