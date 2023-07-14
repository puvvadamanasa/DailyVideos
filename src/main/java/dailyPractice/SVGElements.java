package dailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
		String xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> statesList = driver.findElements(By.xpath(xpath));
		System.out.println(statesList.size());
		for(WebElement e:statesList) {
			String name = e.getAttribute("name");
			System.out.println(name);
			if(name.equals("Maryland")) {
				e.click();
			}
		}
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
		String xpath1="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> List = driver.findElements(By.xpath(xpath1));
		System.out.println(List.size());
		for(WebElement e1:List) {
			String names = e1.getAttribute("name");
			System.out.println(names);
			if(names.equals("Charles County")) {
				e1.click();
			}
		}

	}

}
