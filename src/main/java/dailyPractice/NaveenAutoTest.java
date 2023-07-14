package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaveenAutoTest {

	public static void main(String[] args) {
		String browserName="chrome";
		BrowserUtils u = new BrowserUtils();
		WebDriver driver = u.initDriver(browserName);
		ElementUtils e = new ElementUtils(driver);
		u.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = u.getPageTitle();
		System.out.println(title);
		if(title.equals("Register Account")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String url = u.getPageURL();
		System.out.println(url);
		if(url.contains("naveen")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cpwd = By.id("input-confirm");
		By agree = By.name("agree");
		By para = By.tagName("h1");
		By reg = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By lt = By.linkText("Order History");
		e.doSendKeys(fname, "masa");
		e.doSendKeys(lname, "pvvda");
		e.doSendKeys(email, "maapuvada@gmail.com");
		e.doSendKeys(telephone, "9978546841");
		e.doSendKeys(pwd, "manasa@1993");
		e.doSendKeys(cpwd, "manasa@1993");
		e.doClick(agree);
		e.doClick(reg);
		String s = e.doElementgetText(para);
		System.out.println(s);
		if(s.contains("Created")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		e.doClick(lt);
		
	
		u.closeBrowser();
	}

}
