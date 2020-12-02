package Tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTests extends TestBases{

	GooglePage GoogleHome;

	@Test
	public void SearchForSelenium() {
		
		try {
			driver.navigate().to("https://www.google.com/ncr");
			GoogleHome = new GooglePage(driver);
			GoogleHome.SendText("selenium webdriver");

			System.out.println(GoogleHome.ThirdResult.getText());
			Assert.assertTrue(GoogleHome.ThirdResult.getText().contains("what is Selenium WebDriver?"));

		} catch (NoSuchElementException e) {
			System.out.println("The Element not found please try again");
		}
	}
}
