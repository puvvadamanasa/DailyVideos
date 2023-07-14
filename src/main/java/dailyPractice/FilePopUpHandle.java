package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePopUpHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Admin\\Downloads\\WhatsApp Image 2023-05-02 at 12.23.55 PM.jpeg");
        //<tag type='file'> mandatory
	}
	

}
