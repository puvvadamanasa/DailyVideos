package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@title,'Vehicle-Registration-Forms')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("jkl");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Hyd");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("2023-05-02");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("hai");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("manasa");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("puvvada");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("klasjd");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("hyd");
		Select select = new Select(driver.findElement(By.id("RESULT_RadioButton-13")));
		select.selectByVisibleText("Alaska");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("411001");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("8978946841");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("sdf@gmail.com");
		driver.findElement(By.id("FSsubmit")).click();
		driver.switchTo().defaultContent();
	}

}
