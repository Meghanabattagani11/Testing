package in.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggy.pages.SwiggyPage;



public class Driver extends Tools {
	
	protected static SwiggyPage swiggypage;

	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		swiggypage = new SwiggyPage(driver);

}
}