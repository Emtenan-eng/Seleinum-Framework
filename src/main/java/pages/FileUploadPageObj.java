package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPageObj extends PageObjectsBases {

	public FileUploadPageObj(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "file-upload")
	WebElement UploadBtn;
	
	@FindBy(id = "file-submit")
	public WebElement SubmitBtn;
	
	@FindBy(id = "uploaded-files")
	public WebElement UploadedImageName;
	
	public void UploadImage(String ImagePath) {
		UploadBtn.sendKeys(ImagePath);
		SubmitBtn.click();
	}
}
