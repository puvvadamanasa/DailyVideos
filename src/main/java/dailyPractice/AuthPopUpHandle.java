package dailyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		//authentication popup
		WebDriver driver = new ChromeDriver();
		String username="admin";
		String password="admin";
		//driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@123@the-internet.herokuapp.com/basic_auth");this
		//will nt work
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
