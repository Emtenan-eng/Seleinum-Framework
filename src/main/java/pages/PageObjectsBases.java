package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsBases {

	protected WebDriver driver;
	
	// create constructor	
	public PageObjectsBases(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
}

