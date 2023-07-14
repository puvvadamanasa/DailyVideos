package dailyPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aertprc2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("puvvadamanasa");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
//		if(text.equals("Please enter your password")) {
//			alert.accept();
//		}
		alert.dismiss();

	}

}
