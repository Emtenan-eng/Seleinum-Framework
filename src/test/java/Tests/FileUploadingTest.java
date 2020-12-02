package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPageObj;
import pages.WelcomeToInternetPage;

public class FileUploadingTest extends TestBases{

	WelcomeToInternetPage HomePage;
	FileUploadPageObj UploadPage;

	@Test
	public void UploadImg() {
		driver.navigate().to("https://the-internet.herokuapp.com/");
		HomePage = new WelcomeToInternetPage(driver);
		UploadPage = new FileUploadPageObj(driver);

		HomePage.OpenUploadingPage();
		String ImageName = "TBS.PNG";
		String ImagePth = System.getProperty("user.dir")+"\\Uploads\\TBS.PNG";
		UploadPage.UploadImage(ImagePth);

		Assert.assertEquals(ImageName, UploadPage.UploadedImageName.getText());
	}
}


