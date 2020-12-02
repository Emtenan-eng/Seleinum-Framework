package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends PageObjectsBases {

	public DynamicLoadingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Example 2: Element rendered after the fact")
	WebElement Example2;
	
	@FindBy(tagName = "button")
	 WebElement StartBtn;
	
	@FindBy (id = "loading")
	public WebElement Loading;
	
	@FindBy(css = "div#finish")
	public WebElement TextDisplayed;
	
	public void GoToSecoundExample() {
	Example2.click();
	}
	
	public void clkStart() {
		StartBtn.click();
	}
}
