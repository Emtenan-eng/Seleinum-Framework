package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBases {

	public static WebDriver driver;
	
	@BeforeSuite
	public void Setup() {
		String Path = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);  
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void Tearup() {
		driver.quit();
	}
}
