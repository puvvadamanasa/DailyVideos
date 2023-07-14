package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//How many frames
		int size = driver.findElements(By.xpath("//frame")).size();
		System.out.println(size);
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String s = driver.findElement(By.tagName("h2")).getText();
		System.out.println(s);
		driver.switchTo().defaultContent();
		//frame
		//iframe
		

	}

}
