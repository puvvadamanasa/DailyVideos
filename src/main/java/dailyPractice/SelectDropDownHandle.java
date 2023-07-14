package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial/");
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country, 5);
		doSelectDropDownByValue(country, "India");
		doSelectDropDownByText(country, "Iran");
	

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownByText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	

}
