package dailyPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPract {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//if(text.equals("Please enter a valid user name")) {
			alert.accept();
		//}
		

	}

}
