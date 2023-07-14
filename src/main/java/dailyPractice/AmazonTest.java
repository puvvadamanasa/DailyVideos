package dailyPractice;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtils b = new BrowserUtils();
		b.initDriver(browserName);
		b.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		String acttitle = b.getPageTitle();
		System.out.println(acttitle);
		if(acttitle.equals("Your Store")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String url = b.getPageURL();
		System.out.println(url);
		if(url.contains("naveen")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		b.quitBrowser();
		
		

	}

}
