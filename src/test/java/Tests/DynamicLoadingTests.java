package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

import pages.DynamicLoadingPage;
import pages.WelcomeToInternetPage;

public class DynamicLoadingTests extends TestBases{
	WelcomeToInternetPage HomePage;
	DynamicLoadingPage LoadingPage;

	@Test
	public void GoToDynamicLoading () {
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		HomePage = new WelcomeToInternetPage(driver);
		LoadingPage = new DynamicLoadingPage(driver);
		
		HomePage.openDynamicLoadingPage();
		LoadingPage.GoToSecoundExample();
		LoadingPage.clkStart();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver, 50);
	//	wait.until(ExpectedConditions.invisibilityOf(LoadingPage.Loading));
		
		Assert.assertTrue(LoadingPage.TextDisplayed.getText().contains("Hello World!"));
	}

}
