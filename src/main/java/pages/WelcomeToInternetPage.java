package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeToInternetPage extends PageObjectsBases{

	public WelcomeToInternetPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="File Upload")
	WebElement fileUploadingLink;
	
	@FindBy(linkText="Dynamic Loading")
	WebElement DynamicLoadingLink;

	public void OpenUploadingPage() {
		fileUploadingLink.click();
	}
	
	public void openDynamicLoadingPage () {
		DynamicLoadingLink.click();
	}
	
}
